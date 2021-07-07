package exceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args){
		//throws key word will terminate the program as we are not handling the exception
		//to overcome this we need to add a try-catch block
		//using throws key word we won't report anything -- no option
		//But in try - catch block, we can report with the help of catch block where we can print the error message.
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
	}
	public void sum(){
		try { //as we use try-catch block, exception got handled and the program continues with the flow
		div(); //exception code
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
//	public void div() { 
//		try { //since we add try-catch block here itself no need of throws declaration in sum() and main()
//		int i = 118/0; // exception line
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//	}
	public void div() throws ArithmeticException{
		int i = 118/0; // exception line
	}
}
