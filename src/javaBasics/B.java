package javaBasics;

public class B extends A{
	
	public B() {
		//super(10,55); // error --> super keyword must always be the 1st statement in a child class constructor
		System.out.println("Child class constructor");
	}
	//if we have to call all the constructors then it will be like this:
	public B(int i) {
		super(i);
		System.out.println("Single parameter constructor in class B");
	}
	public B(int i, int j) {
		super(i,j);
		System.out.println("Two parameter constructor in class B");
	}
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10,20);
	}

}
