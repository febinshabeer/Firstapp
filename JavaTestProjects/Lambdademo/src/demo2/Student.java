package demo2;

import java.util.ArrayList;
import java.util.List;



@FunctionalInterface
interface Studentoperations
{
	boolean operation(String name);
}
public class Student {

	public boolean studentservices(String name,Studentoperations obj)
	{
		return obj.operation(name);
	}
	public static void main(String[] args) {
		
		ArrayList<String> studentlist=new ArrayList<String>();
		studentlist.add("febin");
		studentlist.add("feb");
		studentlist.add("bin");
		studentlist.add("zoha");
		System.out.println("List before operation"+studentlist);
		
		Studentoperations add=(name)->studentlist.add(name);
		Studentoperations remove=(name)->studentlist.remove(name);
		//Studentoperations search=(name)->studentlist.("ninnu");
		
		Student s=new Student();
		
		System.out.println("List after adding a name"+s.studentservices("ninnu", add));
		System.out.println(studentlist);
		System.out.println("List after deleting a name"+s.studentservices("feb", remove));
		System.out.println(studentlist);
	}

}
