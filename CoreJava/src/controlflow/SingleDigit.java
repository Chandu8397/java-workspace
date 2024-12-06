package controlflow;

import java.util.Scanner;

public class SingleDigit {  
	
   //program to check wheather a number is Single digit or Not
	
	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter a numbers : ");
		num=scan.nextInt();
		
		//Implementing Conditional Statements
		//Logical - It is used to combine Multiple Conditions
		 
		if(num>-10 && num<10) {
			System.out.println(num+" Is Single Digit ");
		}
		else {
			System.out.println(num+" Is Not a Single Digit ");
		}
		scan.close();
	}

}
