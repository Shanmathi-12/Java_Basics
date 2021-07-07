package OOPConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		//an object will be created and obj is the reference variable, referring to this object
		//after creating the object, all the non-static methods will be given to this object
		//main() which is static will not be given, bcoz object cannot handle static methods  
		obj.test();
		System.out.println(obj.add());
		//obj.add();
		String s1 = obj.qa();
		System.out.println(s1);
		int div = obj.division(40, 5); //one-to-one mapping occurs a-->40 and b-->5
		System.out.println(div);
		//main method is void --> It never returns a value
	}
	//non static methods
	
	//void - doesn't return any value
	//return type --> void
	public void test() { //no input, no output
		System.out.println("Test Method");
	}
	
	//return type --> int
	public int add() { //no input, some output
		System.out.println("Add Method");
		int x=10;
		int y=22;
		int z = x+y;
		return z;
	}
	
	//return type --> String
	public String qa() { //no input, some output
		System.out.println("qa Method");
		String s = "Selenium Testing";
		return s;
	}
	
	//return type --> int
	//a,b --> input parameters or arguments
	public int division(int a, int b) { //some input, some output
		System.out.println("Division Method");
		int d = a/b;
		return d;
	}
}
