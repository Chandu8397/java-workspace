package logicbuilding;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :4 Nov 2024
*Time   :9:54:27 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class PyramidOfNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = i; j < n; j++) {   //Printing leading Spaces
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {  //printing Increasing Numbers
				System.out.print(j);
			
		}

			for(int j = i - 1; j >= 1; j--) {  //printing Decreasing Numbers
				System.out.print(j);
			}
			
			System.out.println();
		
		}
		scanner.close();
	}
}
