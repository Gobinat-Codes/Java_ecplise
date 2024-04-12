// hybrid inheritance  --> combination of single and multilevel inheritance
//--------------------


package oops;

public class Hybrid_inheritance01 {
	public void god() {
		System.out.println("Shiva");
	}
}

class Hybrid02 extends Hybrid_inheritance01{
	public void god2() {
		System.out.println("shakthi");
	}
}

class Hybrid03 extends Hybrid_inheritance01{
	public void god3() {
		System.out.println("vinayagar");
	}
}

class Hybrid04 extends Hybrid03{
	public void god4() {
		System.out.println("murugan");
	}
}

class Hybrid05 extends Hybrid04{
	public void god5() {
		System.out.println("ayyapan");
	}
}

class Hybrid06{
	Hybrid05 obj1 = new Hybrid05();
	Hybrid_inheritance01 obj2 = new Hybrid_inheritance01();
	Hybrid02 obj3 = new Hybrid02();
	obj1.god();
	obj2.god();
	obj3.god();
	obj3.god2();
	obj1.god3();
	obj1.god4();
	obj1.god5();
}
