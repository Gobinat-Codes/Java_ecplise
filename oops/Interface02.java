// multiple interface

// Note : java does not support multiple inheritance but with this achieve multiple inheritance

package oops;

public interface Interface02 {
  public void chennai();
}

interface Interface04{
	public void trichy();
}

class Interface03 implements Interface02,Interface04{
	public void chennai() {
		System.out.println("marina beach");
	}
	
	public void trichy() {
		System.out.println("malakottai");
	}
}

class Combine{
	public static void main(String[] args) {
		Interface03 obj1 = new Interface03();
		obj1.chennai();
		obj1.trichy();
	}
}