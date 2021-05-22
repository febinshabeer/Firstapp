package Callbyvalue;

public class Demo1 {
   int z;
	public static void main(String[] args) {
		int x=10;
		System.out.println("value of x:"+x);
        int z=Demo1.change(x);
        System.out.println("value of x after change: "+x);
        
        Demo1 d=new Demo1();
        int l=Demo1.change(d.z);
        System.out.println("value of z after change uring obj:"+d.z);
        
        
	}
	
	static int change(int y)
	{
		y=y+1;
		return y;
	}
}
