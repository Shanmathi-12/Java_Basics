package OOPConceptsPart2;

public class BMW extends Car{ //has-a relationship -- class to class relationship (extends keyword)
	
	//when method with same name and same number and type of parameters are present in parent class as well as in child class,
	//it is called as method overriding 
	public void start() { // overridden method
		System.out.println("BMW--start");
	}
	public void theftSafety() {
		System.out.println("BMW--theftSafety");
	}
	
	//@Override --> we cannot override a static method
	//static is always relevant to class not objects, hence overriding not possible for static methods
	//public void doorclose(){ //This instance method cannot override the static method from Car
	
	public static void doorclose(){ // This concept is method hiding
		System.out.println("BMW--doorclose");
	}
	
//	@Override
//	private void autogear() { //we can't override a private method because it is not accessible here
//		System.out.println("Car--autogear");
//	}
}
