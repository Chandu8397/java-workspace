package oopsdemo1;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :25 Oct 2024
*Time   :4:12:23 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to create Instance Class and Define state & Behaviour
*/

//Instance Class - Encapsulation
public class Student {
	
	
	//define properties/states/attributes
	private int rollNumber;
	private String firstName,lastName;
	private float[] marks=new float[5];
	private float total;
	
	Scanner scanner=new Scanner(System.in);
	
	//define methods,behavior/actions
	public void inputStudentDetails() {
		System.out.println("Enter Roll Number of a Student :");
		rollNumber=scanner.nextInt();
		
		System.out.println("Enter First Name & Last Name of the student :");
		firstName=scanner.next();
		lastName=scanner.next();
		
		System.out.println("Enter Marks of 5 Subjects :");
		for (int i = 0; i < marks.length; i++) {
		marks[i]=scanner.nextFloat();
		}
	}
	
	//method with float as return type
	public float calculateTotalMarks() {
		for (int i=0; i<marks.length; i++){
		total+=marks[i];
	}
	return total;
 }

public void displayStudentDetails() {
	System.out.println("****** Student Result Inforation ****** ");
	System.out.println("Roll Number             : "+rollNumber);
	System.out.println("student Name            : "+firstName+" "+lastName);
	System.out.println("Total Marks             : "+total);
	System.out.println("*********************************");
}
	}
