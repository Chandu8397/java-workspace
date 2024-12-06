package oopsdemo1;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :10:47:45 am
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to enter Employee details, Calculate Net salary & Display salary slip
*/

public class Employee {
	
	// data Abstraction - define Properties & methods
	//define Attributes
	private int empId;
	private String firstName,lastName,desig;
	private double basic,hra,da,grossSalary,netSalary;;
	private static final double TAX= 1000;               //Constant declaration
	
	Scanner scanner= new Scanner(System.in);
	
	//Default Constructor
	
	//define methods
	public void inputEmployeeDetails() {
		System.out.println(" Enter Employee ID, FirstName, lastName, & Designation");
		empId= scanner.nextInt();
		firstName=scanner.next();
		lastName=scanner.next();
		scanner.nextLine();
		desig=scanner.nextLine();
		System.out.println("Enter Basic salary of Employee");
		basic=scanner.nextDouble();
	}
	
	public void calculateNetSalary() {
		hra = basic*0.25;
		da = basic*0.15;
		grossSalary = basic+hra+da;;
		netSalary= grossSalary - TAX;
		
	}
	
	public void displayEmployeeDetails() {
		System.out.println("****** Employee Salary Slip ****** ");
		System.out.println("Employee Id            : "+empId);
		System.out.println("Employee Name            : "+firstName+" "+lastName);
		System.out.println("Designation          : "+desig);
		System.out.println("Basic                : "+basic);
		System.out.println("HRA                  : "+hra);
		System.out.println("Dearness Allow               : "+da);
		System.out.println("Gross Salary              : "+grossSalary);
		System.out.println("Tax                : "+TAX);
		System.out.println("------------------------------------------");
		System.out.println("Net Salary            : "+netSalary);
		System.out.println("--------------------------------------------");
		}
	}
	


