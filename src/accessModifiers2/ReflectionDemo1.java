package accessModifiers2;
import accessModifiers1.One;
import java.lang.reflect.Method;

public class ReflectionDemo1 {

	public static void main(String[] args) throws Exception {
		int j=10;
		String s1 = "Parameterized Private Function and it's value is: ";
		//Class c = Class.forName("accessModifiers1.One");
		Class c = One.class; //One.class --> accessModifiers1.One 
		One o3 = (One) c.newInstance();
		//Method m = c.getDeclaredMethod("privateFuncwithArg",new Class[] {String.class, Integer.class}); //throws java.lang.NoSuchMethodException
		Method m = c.getDeclaredMethod("privateFuncwithArg",new Class[] {String.class, int.class});
		//Class[] types = new Class[] { String.class, Integer.class }; is a declaration and initialization in one line. 
		//It says create an array that holds objects of type Class and initialize it with two objects of type Class, 
		//representing the class of String and the class of Integer. 
		m.setAccessible(true);
		m.invoke(o3, s1, j);
		m.invoke(o3,"Hello",5); 
	}

}
