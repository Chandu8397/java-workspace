package logicbuilding;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :4 Nov 2024
*Time   :10:02:55 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class CollatzSequence {           

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter n value: ");
		long n = scanner.nextLong();
		
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;      //Collatz Sequence/Conjecture = 3n+1
			}
			
		}
		System.out.println(1);
		scanner.close();
		}

}
