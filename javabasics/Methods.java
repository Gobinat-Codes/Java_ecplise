package javabasics;

public class Methods {
	
	static void methodStatic() {
		System.out.println("static method called successfully");
	}
	
	public void methodPublic() {
		System.out.println("public method called successfully");
	}
	
	void methodVoid() {
		System.out.println("void method called successfully");
	}
	
	public static void main(String[] args) {
		// static method ,  calls directly
		methodStatic();
		
		// public method , non-static method, creates object for method call
		Methods obj1 = new Methods();
		obj1.methodPublic();
		
		// void method , also a non-static method, creates object for method call
		obj1.methodVoid();
	}
	
}
