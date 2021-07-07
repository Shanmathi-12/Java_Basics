package OOPConceptsPart2;
//Encapsulation is bindin\]=-6yhnl g data with methods
class Sample {
	//public class variables
//	int age; 
//	String name;
	//make the class variables as private, so that only accessible within the class 
	//values will be accessed & modified with the help of getters and setters
	private int age;
	private String name;
	//getters and setters will be public
	//getter setter methods for age --> manually defined
//	public void setAge(int a) {
//		age = a;
//	}
//	public int getAge() {
//		return age;
//	}
	//since encapsulation is well known we can directly use this with the help of java inbuilt functionalities
	//Source -- generate getters and setters... -- select the variables for which you need getters and setters
	public int getAge() {
		System.out.println("User is accessing the value"); //Can maintain log file
		return age;
	}
	public void setAge(int age) {
		//User is changing the value -- can maintain the log file
		System.out.println("User is changing the value");
		this.age = age;
	}
	public String getName() {
		// check the log-in of the user --> we can add set of statements to verify the user
		return name;
	}
	public void setName(String name) {
		this.name = name;	}
	
}
public class Encapsulation{
	//use of encapsulation:
	//1. We can maintain the log files with getters and setters
	//2. We can check the log-in of the user before fetching the name  
	public static void main(String[] args) {
		Sample e = new Sample();
		//public variables can be modified easily from other class
		/*
		e.age = 25; 
		e.name = "Shanthi";
		System.out.println(e.age);
		System.out.println(e.name);*/
		e.setAge(15);
		e.setName("Monish");
		System.out.println("Age is: "+e.getAge());
		System.out.println("Name is: "+e.getName());
	}

}
