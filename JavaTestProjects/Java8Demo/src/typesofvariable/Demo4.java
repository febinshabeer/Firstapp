package typesofvariable;

public class Demo4 {

	int i=0;
	static int count=0;
	
	public void modify()
	{
		while(i<5)
		{
			count++;
			i++;
		}
	}
	public static void main(String[] args) {
		
		Demo4 obj=new Demo4();
		obj.modify();
		System.out.println(obj.count);
		//System.out.println(10/0);
		System.out.println(10/0.0);
		//System.out.println(0/0);
		//System.out.println(0/0.0);
		
		String s1="febin";
		String s2="febin";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}

}
