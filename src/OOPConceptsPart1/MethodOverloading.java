package OOPConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(121.45);
		obj.sum(10);
		obj.sum(20, 30);
	}
	//we can overload main method also
    public static void main(int p) {
		

	}
    public static void main(int q,int r) {
		

	}
    //we cannot create a method inside a method
    //duplicate methods i.e., same method name with same number of parameters are not allowed
    /*method overloading -- when the method name is same with different number of input parameter/arguments 
    with different data types within the same class */
    
	public void sum() //0 input parameter
	{
		System.out.println("Sum Method -- zero parameter");
	}
	public void sum(double d) // 1 input parameter -- double
	{
		System.out.println("Sum Method -- 1 input parameter of double type");
		System.out.println(d);
	}
	public void sum(int i) // 1 input parameter -- int
	{
		System.out.println("Sum Method -- 1 input parameter of int type");
		System.out.println(i);
	}
	public void sum(int k, int j) // 2 input parameters
	{
		System.out.println("Sum Method -- 2 input parameters");
		System.out.println(k+j);
	}
	
}
