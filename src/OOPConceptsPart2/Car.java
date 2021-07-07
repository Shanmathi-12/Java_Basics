package OOPConceptsPart2;

// we are not going to execute this class, only designing. So, no main class
public class Car extends Vehicle{
	public void start() {
		System.out.println("Car--start");
	}
	public void stop() {
		System.out.println("Car--stop");
	}
	public void refuel() {
		System.out.println("Car--refuel");
	}
	public static void doorclose(){
		System.out.println("Car--doorclose");
	}
	private void autogear() {
		System.out.println("Car--autogear");
	}
}
