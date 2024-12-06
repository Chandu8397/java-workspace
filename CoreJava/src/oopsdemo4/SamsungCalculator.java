package oopsdemo4;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :12:34:40 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class SamsungCalculator implements ICalculator {
	
	Scanner kb;

	@Override
	public void add() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);		
		
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform subtraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("Sub of "+a+" and "+b+" is "+s);		
	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Mul of "+a+" and "+b+" is "+s);		
	}

	@Override
	public void div() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform division");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("Div of "+a+" and "+b+" is "+s);		
	}
	
	public void display() {
		System.out.println("Calculator Designed By GreatPerson");
	}
	

}
