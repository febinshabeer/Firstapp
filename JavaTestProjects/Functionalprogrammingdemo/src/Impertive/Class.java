package Impertive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Class {

	public static void main(String[] args) {
		
		List<Person> people=new ArrayList<Person>();
		people.add(new Person("zoha", "female"));
		people.add(new Person("zennu", "female"));
		people.add(new Person("john", "male"));
		people.add(new Person("mike", "male"));
	
		//imperative approach
		List<Person> females=new ArrayList<Person>();
		for(Person person: people)
		{
			if( "female" .equals(person.gender))
					{
				      females.add(person);
					}
		}
		for(Person female:females)
		{
			System.out.println(female.name+"  "+female.gender);
		}
		
		System.out.println("Declerative approch");
	  people.stream().filter(person->person.gender.equals("female")).forEach(System.out::println);	
	   
	}



static class Person
{
  private final String name;
  private final String gender;
public Person(String name, String gender) {
	super();
	this.name = name;
	this.gender = gender;
}
  

}
}