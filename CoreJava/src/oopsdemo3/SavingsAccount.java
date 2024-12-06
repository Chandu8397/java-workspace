package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :3:40:53 pm
*Email  :Mekapothula.Reddy@coforge.com
*/
//Class for Savings Account
public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate= interestRate;
		
	}

	//generating Getters Method
	public double getInterestRate() {
		return interestRate;
	}
	
}
