package datatype;
class A
{
	protected int x;
	static int y;
}
class B extends A
{
	
}
public class TestProtected {
public static void main(String[] args)
	{
	A a=new B();
	System.out.println(a.x);
	}
	
}
