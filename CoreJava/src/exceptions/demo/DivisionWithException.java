package exceptions.demo;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :12:52:01 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Division of 2 Numbers with Exception Handling using try-Catch-
*/

public class DivisionWithException {

	public static void main(String[] args) {
		int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers :");
        a = input.nextInt();
        b = input.nextInt();
        
        try {
        result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
        System.out.println("Result = " + result);
        } 
        
        //using Exception object
        catch(Exception ex) {
        	System.out.println("Please Enter Second Number as Non-Zero");
        	System.err.println("Exception Name & Description:"+ex.toString());
        	System.err.println("Exception Description :"+ex.getMessage());
        	ex.printStackTrace();
        }
        finally {   //cleanup Operation
        	input.close();
        	System.out.println("In Finally Block");

        	
        }
        	
      }
}
