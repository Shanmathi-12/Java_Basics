package javaBasics;

public class ConditionStatements {

	public static void main(String[] args) {
		int a = 60;
		int b = 50;
		//if statement
		if(a>b) {
			System.out.println("a is greater than b");
		}
		//if else
		if(b>a) {
			System.out.println(b+" is greater than "+a);
		}
		else {
			System.out.println(a+" is greater than "+b);
		}
		//arithmetic operators: + - * / % ++ --
		//assignment operator: =
		//comparision or relational operators: < <= > >= == !=
		//logical operators: && || !
		int c=20;
		int d =20;
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println(c>d);
		System.out.println(c>=d);
		System.out.println(c<d);
		System.out.println(c<=d);
		//logic to find the highest number
		int a1 = 300;
		int b1 = 100;
		int c1 = 200;
		//nested if-else
		//if(a1>b1 | a1>c1) --> if one of the statements is true, then condition is true
		//if(a1>b1 && a1>c1) --> && and & both operates similarly
		if(a1>b1 & a1>c1) {//if both are true, then only condition true
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}	
		//switch - case: we can use only int / String / Enums
		//data type shld be same for comparision
		String x = "E";
		switch(x) {
		case "L":
			System.out.println("Performance is poor");
			break;
		case "E":
			System.out.println("Slow performer");
			break;
		case "C":
			System.out.println("Consistently Meeting Expectation");
			break;
		case "X":
			System.out.println("Exceeding Expectation");
			break;
		default:
			System.out.println("You are fired!");
		}
	}

}
