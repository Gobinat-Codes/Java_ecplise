// class and object
//--------------------


// pascal case -> first word's first letter starts in uppercase followed by other word's first letter starts in upper case
// Eg. CustomerName , StudentName , etc

// camel case -> first word's first letter must starts in lower case followed by other word's first letter starts in upper case
// Eg. rollNo, mobileNumber, countryCode, callCenter , etc

// in java class name must starts in Upper case or pascal case

// variables and methods name must be in camel case

package oops;

public class Inheritance01{
	public String names = "Hello world";  // variables are other wise called as attributes (variable name must be in camel case)
	
	public void name() {                  // method (camel case)
		System.out.println("bully");
	}
	
	public Inheritance01(){				// constructor
		System.out.println("constructor called");
	}
	
	public static void main(String[] args) {
		Inheritance01 obj1 = new Inheritance01();
		System.out.println(obj1.names);
		obj1.name();
	}
}
