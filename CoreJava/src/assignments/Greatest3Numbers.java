package assignments;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :10:55:52 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Largest 3 Numbers
*/

public class Greatest3Numbers {

	public static void main(String[] args) {
		int num1, num2,num3, result;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Three Numbers :");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		/*  Using Terinary, (Condition)?Expression1:Expression2; */
		result=(num1 > num2 && num1 > num3)?num1:(num2 > num3? num2: num3);
		
		System.out.println("The Greatest of Three Numbers is: "+result);
		scan.close();
		}

}
