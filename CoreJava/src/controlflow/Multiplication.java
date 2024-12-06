package controlflow;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :3:15:43 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to display Multiplication table of a number
*/

public class Multiplication {

	public static void main(String[] args) {
		
		int i=1,mul,num;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter a Number");
		num=scan.nextInt();
		scan.close();
		
		System.out.println("***** Multiplication Table of : "+num+" ******");
		while(i<=10) {
			mul = num*i;
			System.out.println(num+" * " +i+" = "+mul);
			
			i=i+1;
		}
	
		

	}

}
