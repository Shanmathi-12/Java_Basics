package OOPConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		/*
		String price1 = "463";
		int price2 = 237;
		System.out.println(price1+price2);
		
		//data conversion from String to int
		int p1 = Integer.parseInt(price1);
		System.out.println(p1+price2);  
		
		//data conversion from String to double
		double p2 = Double.parseDouble(price1);
		System.out.println(p2);
		System.out.println(p2+price2);
		
		//data conversion from String to boolean
		boolean b = Boolean.parseBoolean(price1);
		System.out.println(b);
		//String bool1 = "TRUE1";//return false
		String bool1 = "trUE";
		boolean b1 = Boolean.parseBoolean(bool1);
		System.out.println(b1);
		
		//data conversion from int to String
		int j=20;
		System.out.println(price2+j);
		String j1 = String.valueOf(j); //"20"
		System.out.println(price2+j1);
		*/
		/*
		//Number Format Exception
		String price = "421.95";
		String u = "100A";
		//Integer.parseInt(price); //java.lang.NumberFormatException: For input string: "421.95"
		Integer.parseInt(u); // java.lang.NumberFormatException: For input string: "100A"
		*/
		//AutoBoxing
		int a = 10;
		Integer b = a;
		System.out.println("Autoboxing: "+b);
		
		//Boxing
		int a1=200;
		Integer b1 = Integer.valueOf(a1);
		System.out.println("Boxing: "+b1);
		
		//UnBoxing
		Integer val = 100;
		int newVal = val.intValue();
		System.out.println("Unboxing: "+newVal);
		
		//AutoUnboxing
		Double dou = 231.22;
		double newDou = dou;
		System.out.println("Auto Unboxing: "+newDou);
	}

}
