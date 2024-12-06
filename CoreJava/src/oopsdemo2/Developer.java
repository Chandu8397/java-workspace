package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :28 Oct 2024
*Time   :10:26:40 am
*Email  :Mekapothula.Reddy@coforge.com
*/


//Child class of Employee
public class Developer extends Employee {
	
    private String tech;
	public Developer(int empId, String name, float basic, String tech) {
		super(empId, name, basic);
		this.tech=tech;
		
		
	}
	
	public void displayDeveloperDetails() {
		System.out.println("Technology      : "+this.tech);
		System.out.println("****************************");
		
	}
	
	
}
