package OOPConceptsPart2;

public class HSBCBank implements USBank, BrazilBank{ //we are achieving multiple inheritance
	//is-a relationship -- interface and class relationship (implements keyword)
	
	//public class HSBCBank implements USBank{ //if we are implementing only USBank interface
	
	//if a class is implementing any Interface, it is mandatory to define/override all the methods of Interface
	//overriding from USBank
	public void credit() {
		System.out.println("hsbc--credit");
	}
	
	public void debit() {
		System.out.println("hsbc--debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("hsbc--transferMoney");	
	}
	
	//separate or own methods of HSBC class
	public void educationLoan() {
		System.out.println("hsbc--Educcation Loan");
	}
	
	public void CarLoan() {
		System.out.println("hsbc--Car Loan");
	}
	
	//overriding from BrazilBank 
	public void mutualFund(){
		System.out.println("hsbc--mutualFund");
	}
}
