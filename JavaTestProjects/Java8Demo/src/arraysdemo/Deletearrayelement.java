package arraysdemo;

public class Deletearrayelement {

	public static void main(String[] args) {
		
		int []x=new int[2];
		x[0]=10;
		x[1]=20;
		//x[2]=30;//this line cause runtime exception
		System.out.println(x);
		//System.out.println(x[2]);//this line cause runtime exception

		int[] c[],b[]=new int[4][];
		c=new int['a'][];//here 'a' is the size
		c[0]=new int[4];
		System.out.println(b.getClass().getName());
		System.out.println("dimention of array c is"+c.getClass().getName());
		
		int[] z=new int[0];
		//z[0]=1;//this line makes no ce but runtime exception
		
		int[][] xy=new int[3][]; 
		
		int[] y=new int[] {1,2,3,4};
		System.out.println(y[0]);
		
		Object[] o=new Object[5];
		o[0]=new Object();
		o[1]=10;
		o[1]=new Integer(11);
		System.out.println(o[1]);
	}

}
