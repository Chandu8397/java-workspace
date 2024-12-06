package basic;

import java.util.Scanner;

/*
 * Java program to perform Arithmetic Operator using Scanner Input methods
 */
public class Arithmetic {

	public static void main(String[] args) {
		
		//Declaration of Variables
		int a,b,sum,sub,mul;
		float div;
		String name;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
	    //Input statement - Take Input using Scanner Object
		System.out.println("Enter 2 numbers :"); 
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("Enter your name : ");
		scanner.nextLine();
		name=scanner.nextLine();
		
		//Process
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=(float)a/b;
		
		//Display output
		System.out.println("*** Arithmetic operations ***");
		System.out.println("The Addition of 2 numbers is       : "+sum);
		System.out.println("The Subtraction of 2 numbers is    : "+sub);
		System.out.println("The Multiplication of 2 numbers is : "+mul);
		System.out.println("The Division of 2 numbers is       : "+div);
		System.out.println("Program created by                 : "+name);
		System.out.println("******************************************");
		
	}
	

}
