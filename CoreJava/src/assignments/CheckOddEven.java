package assignments;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :9:48:50 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Checking the number is ODD or EVEN
*/

public class CheckOddEven {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = scanner.nextInt();
		
		if(num %2 == 0) {
		   System.out.println(num+ "is a Even Number");
	}
		else {
			System.out.println(num+ "is a Odd Number");
		}
		scanner.close();
		}		
		
}
