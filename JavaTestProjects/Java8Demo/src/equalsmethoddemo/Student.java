package equalsmethoddemo;

public class Student {
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		Student s1=new Student(1,"febin");
		Student s2=new Student(2,"zoha");
		Student s3=new Student(1,"febin");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		s1=s2;
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1+" "+s2);
		

	}

}
