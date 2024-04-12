// encapsulation - type 01

// this is a DTO --> Data Transfer Object

// this is also a POJO class --> Plain Old Java Object\


// purpose : data hiding

package oops;

public class Encapsulation01 {
	private String name;   // private variable
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	public static void main(String[] args) {
		Encapsulation01 obj1 = new Encapsulation01();
		obj1.setName("Gobinat");
		System.out.println(obj1.getName());
	}

}
