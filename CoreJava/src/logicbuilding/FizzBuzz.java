package logicbuilding;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :5 Nov 2024
*Time   :9:45:17 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Integer n(1 <= n <= 1000:) ");
		int n = scanner.nextInt();
		
		for (int i=1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0){
				System.out.println("Fizz");
			}else if (i % 5 == 0){
				System.out.println("Buzz");
			
		} else {
			System.out.println(i);
		}
			}
		scanner.close();
		}

}
