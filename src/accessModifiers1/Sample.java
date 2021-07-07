package accessModifiers1;

public class Sample{
	private void method1() {
		System.out.println("priavte in Same class");
	}
		
	public static void main(String[] args) {
		One on = new One();
		on.publicFunc();
		on.defaultFunc1();
		on.protectedFunc();
		//on.privateFunc(); // private, hence can't be accessed
		
		Two t = new Two();
		t.defaultFunc();
		
		Sample s = new Sample();
		s.method1();
	}
}
