package first10;

public class demo3 {

	static void add(String s,StringBuffer sb)
	{
		s.concat("***");
		sb.append("***");
	}
	public static void main(String[] args) {
		
		String s="aaa";
		StringBuffer sb=new StringBuffer("aaa");
		add(s,sb);
        System.out.println(s+"  "+sb);
	}

}
