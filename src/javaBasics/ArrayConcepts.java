package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		//1. int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println("Int Array size: "+i.length);
		for(int j=0; j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//2. double array
		double d[] = new double[3];
		d[0] = 1.22;
		d[1] = 12.11;
		d[2] = 31.24;
		System.out.println(d[2]);
		//System.out.println(d[3]); //ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
		//3. char array
		char c[] = new char[3];
		c[0] = 68; // checks ASCII table
		c[1] = 'a';
		c[2] = '$';
		for(int x=0; x<c.length;x++) {
			System.out.println(c[x]);
		}
		
		//4. boolean array
		boolean b[] = new boolean[2];
		b[0] = false;
		b[1] = true;
		System.out.println(b[0]);
		
		//5. String array
		String s[] = new String[3];
		s[0] = "Test";
		s[1] = "Java";
		s[2] = "Selenium";
		//s[3] = "web"; // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3, at java:46)
		//stops execution at this point only. does not goes to java:48
		//System.out.println(s[3]);
		System.out.println(s[1]);
		
		//6. Object array
		Object ob[] = new Object[6];
		ob[0] = "Abi";
		ob[1] = 26;
		ob[2] = 30000.00;
		ob[3] = 'F';
		ob[4] = true;
		ob[5] = "Goa";
		for(int a=0;a<ob.length;a++) {
			System.out.println("Value at position "+a+" is: "+ob[a]);
		}
	}

}
