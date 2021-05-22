package scopedemo;

public class demo1 {
static int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// compile time error
		//int x; duplicate element
		int y;
		for(x=0;x<3;x++)
		{
			System.out.println(x);
		}
		System.out.println(x);
	}

}
