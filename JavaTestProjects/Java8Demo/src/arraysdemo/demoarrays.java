package arraysdemo;

public class demoarrays {

	public static void main(String[] args) {
		
		int[] x=new int[2];
		int []x1;
		int[] x2;
		int x3[];
		int [] x4;
		//int[4] x5;  error
		//int[] x6=new int[];
		
		int[][] c;
		int [][]c1;
		int [][] c2;
		int[] []c3;
		int c4[][];
		int []c5[]=new int[3][];
		System.out.println(c5.getClass().getName());
		
		int xx[][]=new int[3][];
		
		double[] darr=new double[4];
		System.out.println(darr[0]);
		
		char[] arr=new char[4];
		System.out.println("empty char arr"+arr[0]);
		
		int[] vv= {10,20,30,40};
		int[] cc= {11,12};
		//vv=cc;
		
		//System.out.println(vv[0]+" "+vv[1]);
		cc=vv;
		//System.out.println(cc[0]+" "+cc[1]+" "+cc[2]+" "+cc[3]+" "+cc[4]); array index out of bound exception
		System.out.println(cc[0]+" "+cc[1]+" "+cc[2]+" "+cc[3]);
        
		int[][] yuy=new int[3][];
		System.out.println(yuy.length);
		//System.out.println(yuy[0].length);
		
		int[][] nn=new int[3][2];
	     
		nn[0]=new int[3];
		//nn[0][0]=1;
		//nn[0][1]=2;
		//nn[1][0]=9;
		System.out.println(nn.length+" "+nn[0].length);
		
		int[] gg=new int[] {1,2,3};
		
		int[] rrt;
		rrt=new int[10];
		
		String[] sty=new String[5];
		//sty[0].concat("hi");
		System.out.println(sty);
		
		String jjk=null;
		String h=new String();
		System.out.println(h.length());
		System.out.println(h.concat("zoha"));
		//System.out.println(jjk.concat("zoha"));
		final int jk;
		jk=10;
		
	}

}
