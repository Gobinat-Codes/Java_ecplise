// polymorphism --> poly means many forms, the term polymorphism refers many forms

package oops;

public class Polymorphism01 {
	public void food() {
		System.out.println("menu");
	}
}

class Poly02 extends Polymorphism01{
	public void food() {
		System.out.println("dosa");
	}
}

class Poly03 extends Polymorphism01{
	public void food() {
		System.out.println("idly");
	}
}

class Poly04 extends Polymorphism01{
	public void food() {
		System.out.println("pongal");
	}
}

class Poly05{
	public static void main(String[] args) {
		
		
		Polymorphism01 obj1 = new Polymorphism01();
		Polymorphism01 obj2 = new Poly02();
		Polymorphism01 obj3 = new Poly03();
		Polymorphism01 obj4 = new Poly04();
		
		obj1.food();
		obj2.food();
		obj3.food();
		obj4.food();
	}
}