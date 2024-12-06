package controlflow;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :5:07:21 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Program for Factorial of a Number 1 + 1 * 2 * 3 * .... * n
*/

public class Factorial {

	public static void main(String[] args) {
		


		int n,fact=1,i;
				try (Scanner scanner = new Scanner(System.in)) {
					System.out.println("Enter a Number : ");
					n=scanner.nextInt();
					
					if(n > 0) {        //value should be greater than Zero
						
						//Loop to find factorial
						for(i=1; i<=n; i++) {
							fact =fact * i;
						}
						
						System.out.println("The Factorial of "+n+" is : "+fact);
					
						}
					else 
					{
						System.out.println("Please Enter Value greater Than Zero");
					}
					scanner.close();
				}
		

	}

}
