package demo1;
interface printer{
	public void printdemopage();
}
public class Demo2 {

	public static void main(String[] args) {
		
		printer print=()->System.out.println("Hello");
		print.printdemopage();
		
		printer p1=()->
		{
	    System.out.println("one");
		System.out.println("two");
		};
		
		p1.printdemopage();
		}

}

