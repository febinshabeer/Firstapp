package Exception;

public class Demo2 {

	public Demo2() {
		
	}
	static ArithmeticException ae;
// ArithmeticException ae   compile time error 
	public static void main(String[] args) {
		String s;
		ArithmeticException a;
		// int l=s.length(); compiletime error
   // throw new ArithmeticException("error");
		throw ae;
		//throw a; compile time error
	}

}
