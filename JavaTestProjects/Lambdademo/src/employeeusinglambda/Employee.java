package employeeusinglambda;

public class Employee {
	int id;
	String name;
	int age;
	String gender;
	String deprtment;
	int yearofjoining;
	double salary;
	public Employee(int id, String name, int age, String gender, String deprtment, int yearofjoining, double salary) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.deprtment = deprtment;
		this.yearofjoining = yearofjoining;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDeprtment() {
		return deprtment;
	}
	public void setDeprtment(String deprtment) {
		this.deprtment = deprtment;
	}
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", deprtment="
				+ deprtment + ", yearofjoining=" + yearofjoining + ", salary=" + salary + "]";
	}
	

}
