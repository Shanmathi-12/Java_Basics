package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		//+ is concatenation operator
		//println - is used to print on the console with a new line
		//print - is just used to print on the console
		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";
		double c = 12.33;
		double d = 10.33;
		System.out.println(a+b);
		System.out.println(x+y);
		//executes operation always from LEFT to RIGHT
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println(c+d+a+b+x+y);
		System.out.println("The value of a is: "+ a);
		System.out.print("Hello Selenium");
		//println - will move the cursor to the next line
		System.out.println("Hello Testing");
		
	}

}
