package basic;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
	
		String customerName;
		double Principal;
		float si;
		int term,rate;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("***** Soft Bank - Simple Interest Calculation*****");
		System.out.println("Enter Customer Name : ");
		customerName=scan.nextLine();
		System.out.println("Enter Loan Amount : ");
		Principal=scan.nextDouble();
		System.out.println("Enter Loan Term : ");
		term=scan.nextInt();
		System.out.println("Enter Rate of Interest : ");
		rate=scan.nextInt();
		
		
		si=(float) (Principal*term*rate)/100;
		
		
		System.out.println("****Loan Details****");
		System.out.println("CustomerName       : " +customerName);
		System.out.println("Principal Amount    :" +Principal);
		System.out.println("Term                :" +term);
		System.out.println("Rate of Interest    :" +rate);
		System.out.println("----------------------------");
        System.out.println("Simple Interest     :" +si);
        System.out.println("----------------------------");
scan.close();
		



	}

}
