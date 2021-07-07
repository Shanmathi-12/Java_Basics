package javaBasics;

public class ConstructorConcept {
	//class variables -- global
	String name;
	int age;
//	String name1;
//	int age1;

//	public ConstructorConcept(String name, int age) {
//		name1 = name; //to overcome this keyword we are using different variables
//		age1 = age;
//	}
	
	//this keyword
	public ConstructorConcept(String name, int age) {
		//name = name; --> it will refer to the local variable inside the constructor
		this.name = name; // refers to the class variable
		this.age = age;
	}
	
	//constructor overloading --> complie time polymorphism (with parameters itself we can decide which method will get executed --> compiler decides)
	public ConstructorConcept() {
		System.out.println("default constructor");
	}
	public ConstructorConcept(int i) {
		System.out.println("single param constructor and value is: "+i);
	}
	public ConstructorConcept(double d) {
		System.out.println("single param constructor and double value is: "+d);
	}
	public ConstructorConcept(int i,int j) {
		System.out.println("2 param constructor and values are: "+i+" and "+j);
	}
//	public ConstructorConcept(String s,int j) {
//		System.out.println("2 param constructor and values are: "+s+" and "+j);
//	}
	public ConstructorConcept(int j,String s) {
		System.out.println("2 param constructor and values are: "+j+" and "+s);
	}
	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept();
		ConstructorConcept cc1 = new ConstructorConcept(10);
		ConstructorConcept cc2 = new ConstructorConcept(10,20);
		ConstructorConcept cc3 = new ConstructorConcept(10.13);
		ConstructorConcept cc4 = new ConstructorConcept("Shanthi",50);
		ConstructorConcept cc5 = new ConstructorConcept(71,"Rock");
		cc.display(); //will return null value and 0
		cc4.display();  //this object will initialize the class variables and displays it
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}

}
