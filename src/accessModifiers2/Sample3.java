package accessModifiers2;
import accessModifiers1.One;
class Child extends One{
	 
	void funct() {
		protectedFunc(); 
		//defaultFunc1(); //change visibility of defaultFunc1() to protected
	}
}
public class Sample3 {

	public static void main(String[] args) {
		Child c = new Child();
		//c.protectedFunc(); //methods in Class One has become static/private once inherited and cannot be accessed by objects directly -- so, I have
		//to create a method and within that I should incorporate the protected function -- by this way we can access the protected methods of base class
		// from derived class 
		c.funct(); //protected function is accessed from other package via inheritance, but for class without main method, 
		//it is achieved by funct() as explained above
		
	}

}
