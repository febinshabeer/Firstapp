package demo1;
@FunctionalInterface
interface MyCalculator{
	public int calculate(int i,int j);
}

public class Lambdademo1 {

	public static void main(String[] args) {
	/*	MyCalculator obj=new MyCalculator() {
			
			@Override
			//Anonnymus class
			public int calculate(int i, int j) {
				// TODO Auto-generated method stub
				return i+j;
			}
		};
		System.out.println(obj.calculate(3, 2));
		*/
    MyCalculator add=(i,j)->i+j;
    System.out.println("using lambda "+add.calculate(10,10));
    
	}

}
