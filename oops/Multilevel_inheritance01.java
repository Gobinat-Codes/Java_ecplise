// inheritance - multilevel inheritance

// note : block chain

package oops;

public class Multilevel_inheritance01 {
	public void animals() {
		System.out.println("chicks");
	}
}

class Multilevel02 extends Multilevel_inheritance01{
	public void animals02() {
		System.out.println("chicken");
	}
}

class Multilevel03 extends Multilevel02{
	public void animals03() {
		System.out.println("hen");
	}
}

class Multilevel04{
	public static void main(String[] args) {
		Multilevel03 obj1 = new Multilevel03();
		
		obj1.animals();
		obj1.animals02();
		obj1.animals03();
	}
}
