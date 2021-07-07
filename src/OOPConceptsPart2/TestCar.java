package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism / compile-time polymorphism
		BMW b = new BMW(); //BMW class is public, so I can create object of BMW class anywhere
		b.start(); 
		b.stop(); // method inherited from parent class Car
		b.refuel(); // method inherited from parent class Car
		b.theftSafety(); //own method of BWM class
		b.engine(); //method inherited from grandparent class Vehicle
		b.doorclose();
		System.out.println("************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.doorclose();
		//c.theftSafety(); //parent class cannot inherit any properties from the child class
		System.out.println("************");
		
		//Up Casting or Top Casting
		Car c1 = new BMW(); //dynamic polymorphism / run-time polymorphism -- child class object can be referred by parent class reference variable
		c1.start(); //only common methods(overridden) and parent class methods will be called using dynamic polymorphism
		c1.stop();
		c1.refuel();
		c1.doorclose();
		//c1.theftSafety(); //we can't take child class properties with parent class reference variable
		Car.doorclose();
		BMW.doorclose();
		//Down Casting
		//BMW b1 = new Car(); // (big) parent cannot fit into (small) child class reference variable
		BMW b1 = (BMW) new Car(); // ClassCast Exception
	}

}
