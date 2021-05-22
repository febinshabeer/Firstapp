package accessmodifiers;

interface Inter
{
 //int k;	compile time error
	int k=19;
}
public class Staticdemo {

	//final int x;     compile time error
	
	final int x=10;
	public static void main(String[] args) {
		
		final int y;
         y=10;
        System.out.println(y);
	}

}
