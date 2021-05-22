package doublecolonoperatordemo;
interface calculator
{
public int catculate(int i,int j);	
}
public class Demo1 {

	public static void main(String[] args) {
		
		calculator c=Demo1::add;
		System.out.println(c.catculate(5, 7));

	}
	public static int add(int i,int j)
	{
		return i+j;
	}

}

