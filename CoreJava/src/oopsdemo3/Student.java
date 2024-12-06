package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :4:58:48 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Student {
	
	//Instance varible declaration
	private int rollNo;
	private String name;
	
	//Static varible declared
	private static String organization= "NEC";      

	public Student(int rollNo, String name) {    
		this.rollNo = rollNo;
		this.name = name;
	}
	
	//Static method can use only static varibles
	public static void organizationChange() {     
		organization= "Coforge";
	}
	
	//Instance method
	public void display() {
		System.out.println(this.rollNo+" " +this.name+" "+organization);
	}
	
}
