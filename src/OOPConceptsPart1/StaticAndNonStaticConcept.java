package OOPConceptsPart1;

public class StaticAndNonStaticConcept {
	//global variables - will have scope across all the functions with some conditions
	String name = "Abi"; //non-static variable
	static int age = 31; //static variable
	
	public static void main(String[] args) {
		//there are 2 ways of calling static methods and variables
		//1. Direct calling
		System.out.println("By Direct Calling");
		System.out.println(age);
		sum();
		//2. Calling by Class name
		System.out.println("Calling by class name");
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.sum();
		
		//creating object and calling non-static methods and variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
	    System.out.println(obj.name);
	    obj.sendMail();
		
	    //can we access static methods by using object reference? yes
	    obj.sum(); //but it is not a best practice (warning will be given)
	}
	public void sendMail() { //non-static method
		System.out.println("sendMail method");
	}
	public static void sum() { //static method
		System.out.println("Sum method");
	}
}
