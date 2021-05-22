import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.SliderUI;

class Student
{
   int id;
   String name;
   int height;
   int weight;
public Student(int id, String name, int height, int weight) {
	super();
	this.id = id;
	this.name = name;
	this.height = height;
	this.weight = weight;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
}

}
public class Demostream2 {

	public static void main(String[] args) {
		
        Student student1=new Student(100,"Febin",5,50);
        Student student2=new Student(200,"bin",6,60);
        Student student3=new Student(300,"Feb",7,40);
        Student student4=new Student(400,"ninnu",8,70);
        
		List<Student> stlist=Arrays.asList(student1,student2,student3,student4);
	//	stlist.forEach(System.out::println);
		
	//list of students whose height is >5	
	 List<Student>list1=stlist.stream().filter(s->s.height>5).collect(Collectors.toList());
	 list1.forEach(System.out::println);
	 
	 //sort the student by name
	stlist.stream().sorted((s1,s2)->s1.name.compareTo(s2.name)).forEach(System.out::println);
	
	//we can chain more than one intermediate operations but only one terminal operation
	//list the students who has weight more than 6 and sort the list by id
	System.out.println("list after sorting students who has weight more than 6 ");
	 List<Student>list2=stlist.stream().filter(s->s.height>6).sorted((s3,s4)->Integer.valueOf(s3.id).compareTo(s4.id)).collect(Collectors.toList());
	 list2.forEach(System.out::println);
	
	//list students name who has height>6
	 List<String>list3=stlist.stream().filter(s->s.height>6).map(s1->s1.name).collect(Collectors.toList());
	 list3.forEach(System.out::println);
	}

}
