package mainmethod;

public class overloadingmain {
	static
	{
		System.out.println("static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("main method");
    
    int x=10;
    System.out.println(x++);
    System.out.println(++x);
    
    System.out.println(""+1+6);
	}
	public static void main(int[] args) {
		// TODO Auto-generated method stub

	}
	static 
	{
		System.out.println("ststic block 2");
	}
}
