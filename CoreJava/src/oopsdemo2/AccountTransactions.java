package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :28 Oct 2024
*Time   :12:12:49 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class AccountTransactions extends SavingsAccount {
	
	private double withdrawal,deposit,finalBalance;

	public AccountTransactions(int accountNumber, String name, float minimumBalance, double balance,
			double withdrawal,double deposit) {
		super(accountNumber, name, minimumBalance, balance);
		
		this.withdrawal = withdrawal;
		this.deposit = deposit;
		this.finalBalance=0;
	}
	
	public void display()
    {
        super.display();
        System.out.println("Deposit Amount    : "+deposit);
        System.out.println("Withdrawal Amount : "+withdrawal);
        finalBalance=(balance+deposit)-withdrawal;
        System.out.println("Final Balance     : "+finalBalance);
    }


}
