import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Demo1 {
	
	private static void printvalue(String str)
	{
		String s=str;
		s.concat(" morning");
		int xyz=s.length();
		System.out.println(str);
		System.out.println(xyz+" length");
		Demo1 objtocall=new Demo1();
		objtocall.showdetail();
		
		
	}
   public void showdetail()
   {
	   int arr[]= {11,12,13,14,15};
	   for(int i=0;i<arr.length;i++)
	   {
		   int jgnj=i*2;
		   int jgn2=jgnj+10;
		   System.out.println(arr[i]);
	   }
   }
	public static void main(String[] args) {
		List<String> courses=new ArrayList<String>();
		
		int a=1;
		int b=2;
		int c=a+b;
		int d=c+5;
		System.out.println(d);
		courses.add("java");
		courses.add("spring");
		courses.add("springboot");
		//courses.stream().map(str->str.toUpperCase()).forEach(System.out::println);
		//courses.stream().map(str->str.toUpperCase()).forEach(Demo1::print);
		courses.stream().map(String::toUpperCase).forEach(Demo1::printvalue);

		//constructor method reference
		//Supplier<String> supplier=()->new String();
		Supplier<String> supplier=String::new;
		
		Demo1 dem=new Demo1();
		dem.printvalue("ggg");
		
		
		
	}

}
