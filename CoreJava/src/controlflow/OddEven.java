package controlflow;

import java.util.Scanner;

//Java program to Check Number is Odd or Even

public class OddEven {

	public static void main(String[] args) {
		
		int num; 
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
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
