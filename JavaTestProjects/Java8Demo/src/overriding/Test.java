package overriding;

class P
{
   int x=10;	
}
class C extends P
{
   static int x=20;	
}
public class Test {

	public static void main(String[] args) {
		
		P p=new P();
		System.out.println(p.x);
		
		
		C c=new C();
		System.out.println(c.x);
		
		
		P p1=new C();
		System.out.println(p1.x);
		

	}

}
