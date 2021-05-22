package overriding;

public class Overloaddemo {

	public int add()
	{
		return 10;
	}
	public void add(int x)
	{
	   System.out.println("add 2");
	}
	public static void main(String[] args) {
		
		Overloaddemo obj=new Overloaddemo();
		System.out.println(obj.add());
		obj.add(20);

	}

}
