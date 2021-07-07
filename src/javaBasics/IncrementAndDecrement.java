package javaBasics;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		//increment operator: ++
		//decrement operator: --
		int a = 1;
		int b = a++; // post increment--> b = a = a+1 (left to right operations performed)
		System.out.println(a);
		System.out.println(b);
		
		int c=1;
		int d = ++c; // pre increment--> first value got incremented by 1 and then assigned to d
		System.out.println(c);
		System.out.println(d);
		
		int x=2;
		int y = x--; // post decrement--> y = x = x-1
		System.out.println(x);
		System.out.println(y);
		
		int i=2;
		int j = --i; // pre decrement--> first value got decremented by 1 and then assigned to j	
		System.out.println(i);
		System.out.println(j);
	}

}
