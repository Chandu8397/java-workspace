package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :11:08:53 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		System.out.println("*****Coforge Limited*****");
		
		
		//Invoke Methods of Employee class using obects
		employee1.inputEmployeeDetails();
		employee1.calculateNetSalary();
		employee1.displayEmployeeDetails();
		
		employee2.inputEmployeeDetails();
		employee2.calculateNetSalary();
		employee2.displayEmployeeDetails();
		
		employee3.inputEmployeeDetails();
		employee3.calculateNetSalary();
		employee3.displayEmployeeDetails();
		}

}
