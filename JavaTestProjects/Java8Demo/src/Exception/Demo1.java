package Exception;

class Myexception extends RuntimeException
{
	Myexception(String s)
	{
		super(s);
	}
}
public class Demo1 {

	public Demo1() {
		
		
	}

	
	public static void main(String[] args)  {
	int x=10;
	if(x<11)
	{ 
		throw new Myexception("Invalid");  
	}
		    }
		}
		
		

	


