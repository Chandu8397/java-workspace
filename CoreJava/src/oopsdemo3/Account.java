package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :3:37:37 pm
*Email  :Mekapothula.Reddy@coforge.com
*
* //class for Account Operations
*/

public class Account {

	private String name;
	    protected double balance;
	    
	    public Account(String name, double balance) {
			super();
			this.name = name;
			this.balance = balance;
		}

		public String getName() {
			return name;
		}

		public double getBalance() {
			return balance;
		}
		
		   
		  //final methods cannot be overridden
		    public final void deposit(double amt){           
		        balance+= amt;
		        System.out.println("Depositing : "+amt);
		    }
		    
		    //Overridden Method
		    public void withdraw(double amt){
		        balance-= amt;
		        System.out.println("Withdrawing :"+amt);
		    }
	    
}
