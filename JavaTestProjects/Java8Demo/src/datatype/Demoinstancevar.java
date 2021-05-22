package datatype;

public class Demoinstancevar {

	int x=10;
	static int y=10;
	public static void main(String[] args) {
		Demoinstancevar obj=null;
		System.out.println(y);
		//System.out.println(obj.x); make nullpointer exception

		int xx=Integer.parseInt("ten");//make number format exception at runtime
		System.out.println(xx);
	}

}
