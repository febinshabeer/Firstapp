package demo2;
@FunctionalInterface
interface Functionaliner1
{
	int operation(int a,int b);
	}
@FunctionalInterface
interface Functionalint2
{
	void symessage(String message);
}
public class Test2 {

	private int operte(int a,int b,Functionaliner1 obj)
	{
		return obj.operation(a, b);
		
	}
	public static void main(String[] args) {
		Functionaliner1 add=(int x,int y)->x+y;
		Functionaliner1 sub=(int x,int y)->x-y;
		Functionaliner1 mul=(int x,int y)->x*y;

		Test2 objt=new Test2();
		System.out.println("after addition"+objt.operte(3, 2, add));
		System.out.println("after subtraction"+objt.operte(3, 2, sub));
		System.out.println("after multiplication"+objt.operte(3, 2, mul));
		
		Functionalint2 ob=(m)->System.out.println("math opertions using lambda "+m);
		ob.symessage("easy");
	}

}
