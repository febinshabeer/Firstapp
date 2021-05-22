package Interfacejava8;

interface Inf
{
	 int x =0;
    void m1();
    void m2();	
}
class infimpl implements Inf
{
	public void m1()
	{
		System.out.println(x);
	}
	public void m2()
	
	{
		
	}
	}
public class Test {

	
	public static void main(String[] args) {

infimpl obj=new infimpl();
System.out.println(Inf.x);
	}

}
