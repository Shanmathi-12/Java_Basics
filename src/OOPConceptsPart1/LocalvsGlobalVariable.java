package OOPConceptsPart1;

public class LocalvsGlobalVariable {
	//global variables (class variables)
	String name = "Tom";
	int age=25;
	//global variables can be used throughout the program
	
	public static void main(String[] args) {
		int i = 10; //local variable for main method
		System.out.println("Value of i under main() is "+i);
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable();
	    System.out.println(obj.name);
	    System.out.println(obj.age);
	    obj.sum();
	    System.out.println(obj.age);
	    //System.out.println(j); // j cannot be resolved to a variable error (as j is a local variable for sum method)
	    //local variables scope are limited to the method in which they are defined
	}
	
	public void sum() {
		//local variables for sum method
		int i = 15;
		int j = 20;
		age = 15; // global variable --> value is modified
		System.out.println("Value of i under sum() is "+i);
		System.out.println("Value of j under sum() is "+j);
		
	}
}
