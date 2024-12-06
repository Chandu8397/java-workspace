package controlflow;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :12:39:19 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class SwitchDemo2 {

	public static void main(String[] args) {
		float num1,num2,result;
		String operator;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 2 Numbers :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Enter Arithmetic Operator (+,-,*,/) :");
		operator=scanner.next();
		scanner.close();
		

		switch (operator) {
		   case "+": result = num1+num2;
		             System.out.println("The Addition of "+num1+" and "+num2+" is:" +result);
		             break;
		             
		   case "-": result = num1+num2;
                     System.out.println("The Subtraction of "+num1+" and "+num2+" is:" +result);
                     break;
                     
		   case "*": result = num1+num2;
           			 System.out.println("The Multiplication of "+num1+" and "+num2+" is:" +result);
           			 break;
           			 
		   case "/": result = num1+num2;
 			         System.out.println("The Division of "+num1+" and "+num2+" is:" +result);
 			         break;
		   default : result = num1+num2;
 			         System.out.println("Invalid Operator");
 			         break;
           			 
		
		}

	}

}
