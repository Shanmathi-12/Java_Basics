package accessModifiers2;
import accessModifiers1.One;

public class Sample1 extends One{
	
	public static void main(String[] args) {
		One o = new One();
		o.publicFunc();
		//o.defaultFunc1();//default methods have accessibility only within the same package
		Sample1 s1 = new Sample1();
		s1.protectedFunc(); //inside other package, protected function is accessible if it is inherited 
		 
		
	}

}
