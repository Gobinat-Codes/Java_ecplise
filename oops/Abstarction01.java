// abstraction --> data security and control vulnerability , code reusability
// data hiding -> hide certain data and shows essential information to the user


// to achieve abstraction we must use "abstract" keyword

package oops;

 abstract class Abstarction01 {
	 abstract void home();   // abstract method -> this method cannot have body in abstract class
	 public void house() {   // normal method
		 System.out.println("beautiful house");
	 }
}   // abstract class contains both normal and abstract methods.

 
 
 // body of the abstract method is present only in sub class or child class
 class Abs extends Abstarction01{
	 public void home() {
		 System.out.println("home sweet home");
	 }
 }
 

  class None{
	 public static void main(String[] args) {
			Abs obj2 = new Abs();
			obj2.home();
			obj2.house();
		 }
 }
  
  // important note : abstract method must and only present inside abstract class