package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println("Minimum balance: "+USBank.min_bal);
		//USBank.min_bal = 200; //final value cannot be changed 
		
		//static or compile-time polymorphism
		HSBCBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		b.educationLoan();
		b.CarLoan();
		System.out.println("**************");
		
		//USBank us = new USBank(); //cannot be instantiated
		
		//dynamic or run-time polymorphism -- child class object can be referred by parent interface reference variable
		USBank b1 = new HSBCBank();
		b1.credit();
		b1.debit();
		b1.transferMoney();
		//b1.CarLoan(); //car loan is a separate / own method from HSBCBank will not be accessible by parent interface reference variable
		//because if it is allowed then from a different class say ICICI bank, I could specify the same line USBank b1 = new HSBCBank();
		//and utilize the own methods only specific to HSBCBank easily
		
		
	}

}
