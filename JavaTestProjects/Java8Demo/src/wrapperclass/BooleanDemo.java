package wrapperclass;

public class BooleanDemo {

	public static void main(String[] args) {
		
		Boolean b=new Boolean(true);
		//Boolean a=new Boolean(truE); compile time error
		Boolean c=new Boolean("True");
		Boolean d=new Boolean("1000");
		System.out.println(b+" "+c+" "+d);
        
		Integer i1=new Integer(10);
		int i=i1.intValue();
		System.out.println(i);
		
		Integer i2=Integer.valueOf(10);
		System.out.println(i2);
		
		String s="100";
		int n=Integer.parseInt(s);
		System.out.println(n);
		
		Integer i3=Integer.valueOf(20);
		String s1=i3.toString();
		System.out.println(s1); 
		
		int x='c';
		System.out.println("the value of x is:"+x);
		int i4=30;
		String s2=Integer.toString(i4);
		System.out.println(s2);
		
		int incr=5;
		System.out.println("after increment"+incr++);
		System.out.println(incr);
	}

}
