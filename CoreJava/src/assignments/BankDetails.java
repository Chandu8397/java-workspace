package assignments;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :28 Oct 2024
*Time   :9:15:14 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class BankDetails {
	
	private long accountNo;
	private String name;
	private double balance,amount;
	private String choice;
	
	Scanner sc=new Scanner(System.in);
	
	public void input() {
		System.out.println("enter the account holder name:");
		setName(sc.nextLine());
		System.out.println("enter the account number:");
		setAccountNo(sc.nextLong());
		System.out.println("intial Balance:");
		balance=sc.nextDouble();
		System.out.println("deposite or withdrawl:");
		choice=sc.next();
		System.out.println("enter the amount:");
		amount=sc.nextDouble();
	
	}
	public void makechoice() {
		if(choice.equalsIgnoreCase("deposite")) {
				balance+=amount;
				System.out.println("deposited ammount is:"+amount);
				System.out.println("balance is:"+balance);
		
		}
		else if(choice.equalsIgnoreCase("withdrawl")) {
			if(balance>=amount) {
				balance-=amount;
				System.out.println("withdrawl ammount is:"+amount);
				System.out.println("balance is:"+balance);
			}
			else {
				System.out.println("insufficient balance");
			}
		}
		else {
			System.out.println("invalid choice");
		}
	}
	
	//getters - Setters
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
