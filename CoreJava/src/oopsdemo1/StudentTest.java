package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :25 Oct 2024
*Time   :4:39:00 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class StudentTest {

	public static void main(String[] args) {
		
		//Create Student Objects
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		System.out.println("*****Coforge Limited*****");
		
		//Invoke Instance class method using dot Operator
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		
		float tot1=s1.calculateTotalMarks();
		float tot2=s2.calculateTotalMarks();
		float tot3=s3.calculateTotalMarks();
		
		s1.displayStudentDetails();
		System.out.println("Display Total Marks returned to main :"+tot1);
		s2.displayStudentDetails();
		System.out.println("Display Total Marks returned to main :"+tot2);
		s3.displayStudentDetails();
		System.out.println("Display Total Marks returned to main :"+tot3);
	}
	

}
