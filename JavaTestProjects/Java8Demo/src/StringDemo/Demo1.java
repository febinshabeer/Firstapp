package StringDemo;

public class Demo1 {

	public static void main(String[] args) {
		String s1="Hello";
		char s2[]= {'h','e','l','l','o'};
		String s3=new String("Hello");
		String s4=new String(s2);
		
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		System.out.println("//////////////////");

		s4="java";
		System.out.println(s4);
		String s5="javaproject";
		String s6=s5.substring(2);
		System.out.println(s6);
		String s7=s5.substring(3,6);
		System.out.println(s7);
		System.out.println(s5.contains("java"));
		System.out.println(s5.contains("javA"));
		
		
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);
		String date=String.join("/", "05","06","2020");
		System.out.println(date);
		String time=String.join(":", "2","10");
		System.out.println(time);
		
	    String sa="java";
	    String sb="Java";
	    String sc="java";
	    String sd="java ";
	    System.out.println(sa.equals(sb));
	    System.out.println(sa.equals(sc));
	    System.out.println(sa.equals(sd));
	    
	
	
	
	}

}
