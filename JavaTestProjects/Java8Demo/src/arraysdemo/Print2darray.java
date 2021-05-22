package arraysdemo;

public class Print2darray {

	public static void main(String[] args) {
		
		int[][] arr=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		int element=1;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=element;
				element++;
			}
		}

		for(int[]x:arr)
		{
			for(int y:x)
				System.out.print(y);
			System.out.println();
		}
	}

}
