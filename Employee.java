//package week3.lab.assignment;


public class Employee {
	
	//_______ Class Variables _______//
	private String firstName;
	private String lastName;
	
	//======= Constructor assigns values to class variables =======//
	Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//======= Getter class for First Name =======//
	String getFirstName() {
		return this.firstName;
	}
	
	//======= Getter class for Last Name =======//
	String getLastName() {
		return this.lastName;
	}
}
