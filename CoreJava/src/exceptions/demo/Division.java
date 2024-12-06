package exceptions.demo;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :12:52:01 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Division of 2 Numbers without Exception Handling
*/

public class Division {

	public static void main(String[] args) {
		int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers :");
        a = input.nextInt();
        b = input.nextInt();

        result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
        System.out.println("Result = " + result);
        input.close();

	}

}
