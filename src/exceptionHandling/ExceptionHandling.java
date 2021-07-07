package exceptionHandling;

public class ExceptionHandling {
//	int a = 20;
//	static ExceptionHandling obj;
	public static void main(String[] args) {
		
		//uncaught exception: 
//		int i = 9/0; //compiler or eclipse or tool which we use will not know the exception until it is executed
//		System.out.println(i);
		
		//caught exception: 
		//Thread.sleep(0); //java will immediately give us a suggestion either handle exception with throws declaration or surround with try-catch block
		
		//Null Pointer Exception
		//1st way
//		ExceptionHandling obj = new ExceptionHandling();
//		obj = null;
//		System.out.println(obj.a);
		//2nd way
//		System.out.println(obj); //gives null value
//		System.out.println(obj.a);
		
		//1. Try - Catch block:
		System.out.println("Start");
		try { //contains the code which generates exception
		int c = 10/0; //exception code
		System.out.println("Result is: "+c);
		}
		catch(ArithmeticException e) { //will handle the exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("This is / by zero error"); //we can even print our own message
		}
		System.out.println("end");
		System.out.println("end");
		System.out.println("end");
	}

}
