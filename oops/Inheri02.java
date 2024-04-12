// inheritance -  single inheritance
// -----------------------------------

// note
//------
// single inheritance
// multiple inheritance -- not supported by java
// multi level
// hieriaricel inheritance -- not supported by java
// hybrid inheritance -> is nothing but combination of single and multi level

package oops;

public class Inheri02 {  // parent class or base class
	public void eniyan() {
		System.out.println("koli kunji");
	}
}

class Thambi extends Inheri02{  // child class or sub class or derived class
	public static void main(String[] args) {
		Inheri02 obj1 = new Inheri02();
		obj1.eniyan();
	}
}
