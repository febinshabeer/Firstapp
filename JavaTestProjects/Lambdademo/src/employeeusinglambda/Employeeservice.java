package employeeusinglambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employeeservice {

	public static void main(String[] args) {
		
		List<Employee> employeelist=new ArrayList<Employee>();
		employeelist.add(new Employee(111,"Febin",33,"female","HR",2011,4245.0));
		employeelist.add(new Employee(112,"josh",33,"male","IT",2013,453335.0));
		employeelist.add(new Employee(113,"ben",35,"male","cs",2014,4545.0));
		employeelist.add(new Employee(114,"holly",63,"female","HR",2010,4545.0));
		employeelist.add(new Employee(115,"bridge",23,"male","civil",2015,4500.0));
		employeelist.add(new Employee(116,"riya",31,"female","dmin",2013,4549.0));
		employeelist.add(new Employee(117,"miya",33,"male","IT",2013,4533385.0));
		employeelist.add(new Employee(118,"rose",33,"male","IT",2013,45333.0));
		employeelist.add(new Employee(119,"riya",33,"male","IT",2013,451335.0));
		employeelist.add(new Employee(120,"ziya",33,"female","IT",2013,451335.0));

		//1.how many male and female employees are there in the organisation
		Map<String,Long> noofmaleandfemale=employeelist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noofmaleandfemale);
		//print name of all departments in the organisation
		List<String> departments=employeelist.stream().map(Employee::getDeprtment).distinct().collect(Collectors.toList());
		System.out.println(departments);
		
		//2.what is the average age of male and female employees in the organisation
		Map<String,Double> avgage=employeelist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(" the average age of male and female employees in the organisation"+avgage);
		
		
		//3.get the details of highest paid employee in the organisation
		Optional<Employee> emp=employeelist.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("highest paid employee inthe organisation"+emp);
		
		
		//4.get the names of employee who has joined after 2010
		System.out.println("the names of employee who has joined after 2010");
		employeelist.stream().filter(e1->e1.getYearofjoining()>2010).map(Employee::getName).forEach(System.out::println);
		
		//5.count the number of employees in each deprtment
		Map<String,Long> nooemplindept=employeelist.stream().collect(Collectors.groupingBy(Employee::getDeprtment,Collectors.counting()));
		System.out.println("the number of employees in each deprtment"+nooemplindept);
		
		//6.what is the average salary of each department
		Map<String,Double> avjsaleachdep=employeelist.stream().collect(Collectors.groupingBy(Employee::getDeprtment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("the average salary of each department"+avjsaleachdep);
		
		//7.find the youngest male employee in the it department
		Optional<Employee> eobj=employeelist.stream().filter(e->e.getGender()=="male" && e.getDeprtment()=="IT").min(Comparator.comparingInt(Employee::getAge));
	    System.out.println("the youngest male employee in the it department"+eobj);
	
       //8.who has the most working experiance in the organisation
	    Optional<Employee> eobj1=employeelist.stream().sorted(Comparator.comparingInt(Employee::getYearofjoining)).findFirst();
	    System.out.println(" the most working experianced employee in the organisation"+eobj1);
	    
	    //9.Howmany male and female and female employees are there in the civil team
	    Map<String,Long> noofmaleandfemaleitncivil=employeelist.stream().filter(e1->e1.getDeprtment()=="civil" ).collect(Collectors.groupingBy(Employee::getDeprtment,Collectors.counting()));
	    System.out.println(" male and female and female employees are there in the  civil team"+noofmaleandfemale);
	    
	    //10.print highest pid three employees in ech department
	    Map<String,List<Employee>> threeemp=employeelist.stream().sorted(Comparator.comparingDouble(Employee::getSalary)). collect(Collectors.groupingBy(Employee::getDeprtment));
	    System.out.println("highest pid three employees in ech department");
	    Set<Entry<String,List<Employee>>> entrySet=threeemp.entrySet();
	    for(Entry<String,List<Employee>> entry:entrySet)
	    {
	    System.out.println("High paid  employee in department :"+entry.getKey()+" ");	
	    	List<Employee> list=entry.getValue();
	    	int count=1;
	    		    		
        for(Employee e:list)
	    		{
	     if(count<4)
	    		System.out.println(e.getName());
	    	    count++;
	    	    }
	    }
	}

}
