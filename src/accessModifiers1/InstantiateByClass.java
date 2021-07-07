package accessModifiers1;

public class InstantiateByClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// instantiating a class using "Class" class.
		Class c = Class.forName("accessModifiers1.One"); //we should specify fully qualified class name
		One o1 = (One) c.newInstance(); //newInstance() will return the object -- This object will be generic, so we add TypeCasting
		o1.publicFunc();
	}

}
