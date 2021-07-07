package OOPConceptsPart2;

public interface USBank {
	int min_bal = 100;
	public void credit(); //Abstract methods do not specify a body, only method prototype -- method declaration
	public void debit();
	public void transferMoney();
	
	//only method declaration
	//no method body -- only method prototype
	//Variables are by default static and final in nature
	//variables value will not be changed, its final / constant in nature
	//no static method in interface 
	//no main method in interface
	//we cannot create object of interface
	//interface is abstract in nature 
}
