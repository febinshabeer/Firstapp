package arraysdemo;

public class Dem {

	static int x=2;
	public final static void main(String[] args) {
	
		int y=10;
		int [] a=new int[x];
		//a[2]=2;
		for(int i:a)
		{
			System.out.println(i);
		}

		int [][] arr= {{1,2},{3,4}};
		for(int a1[]:arr)
		{
			for(int s:a1)
				System.out.println(s);
		}
		// for(int a=0;a<10;a++) compile time error duplicate element a
		for(int x=0;x<10;x++)
		{
		//	int y; compile time error duplicate element
		}
		int x=10;
	}

}
