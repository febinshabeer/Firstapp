package StringDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
     
		StringBuffer sb=new StringBuffer("febin");
		sb.length();
		System.out.println("capasity of sb is"+sb.capacity());
		StringBuilder sb1=new StringBuilder();
		System.out.println("capasity of sb1 is"+sb1.capacity());
		String str1=new String(new StringBuffer());
		String s3="john";
	//	List student=new ArrayList<String>(); error
		List<String> student=new ArrayList<String>();
		student.add("ram");
		student.add("john");
		student.add("man");
		
		for(String s:student) 
		{
			if(s.equals("john")) 
			
			//if(s.equals(s3))
			{
				System.out.println("john is present");
			}
		}

	}

}
