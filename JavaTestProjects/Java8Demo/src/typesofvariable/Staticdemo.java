package typesofvariable;

public class Staticdemo {
	
	int x;
	static int y=67;
	public void m1()
	{
		System.out.println(y);
	}
   public static void m2()
   {
	   System.out.println(y);
   }
	public static void main(String[] args) {
	
		m2();
		Staticdemo obj=new Staticdemo();
		obj.m1();

	}

}
