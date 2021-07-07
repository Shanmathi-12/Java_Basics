package accessModifiers1;

import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("accessModifiers1.One");
		One o2 = (One) c.newInstance();
		Method m = c.getDeclaredMethod("privateFunc", null);
		m.setAccessible(true); // to make the private method accessible
		m.invoke(o2, null);
	}

}
