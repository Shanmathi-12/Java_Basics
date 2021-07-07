package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// throw keyword is used to create our own exception or custom exception
		// throw keyword is used when we have to throw an exception deliberately
		System.out.println("Start");
		try {
			throw new Exception("Sample Exception"); //if throws declaration added, then program will terminate
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Test");
		// a real time example for throw key word
		// if some cell or column is blank or found as NO, while reading an excel, then
		// we can create our own exception
		String Exec_Flag = "No";
		if (Exec_Flag.equalsIgnoreCase("NO")) {
			try {
				throw new Exception("Value is NO Exception");
			} 
			catch (Error | Exception e) { //if we are not sure whether error or exception occurs
			//catch (Throwable e) { //Throwable is super class of Error and Exception class
				e.printStackTrace();
			}
		}
		System.out.println("Test done");
	}
}
