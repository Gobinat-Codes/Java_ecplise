// interface -> interface is also a abstract class, contains only methods without body
// the body of the interface methods must only have in sub class or implements class
// have both abstract and regular methods

// to declare a class as interface we must use the "interface" keyword
// to achieve interface we must use "implements" keyword


// single interface

package oops;

 interface Interface01 {
	public void plants();
	public void animals();
}

 class Organic implements Interface01{
	 public void plants() {
		 System.out.println("rose plant");
		 }
	 
	 public void animals() {
		 System.out.println("tiger");
	 }
 }

 class Organic02{
	 public static void main(String[] args) {
		 Organic obj1 = new Organic();
		 obj1.plants();
		 obj1.animals();
	 }
 }



// Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
// Interface methods do not have a body - the body is provided by the "implement" class
// On implementation of an interface, you must override all of its methods
// Interface methods are by default abstract and public
// Interface attributes are by default public, static and final
// An interface cannot contain a constructor (as it cannot be used to create objects)