package ConstructorDemo;

public class Vehicle {

	String tye="4W";
	int maxspeed=100;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String tye, int maxspeed) {
		
		this.tye = tye;
		this.maxspeed = maxspeed;
	}
class Car extends Vehicle{

	String trans;
	Car(String trans)
	{
		
		this.trans=trans;
	}
	}
	
	


	public static void main(String[] args) {
	
	}

}
