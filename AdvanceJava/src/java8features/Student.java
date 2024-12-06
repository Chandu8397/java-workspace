package java8features;

/**
*Author :Mekapothula.Reddy
*Date   :8 Nov 2024
*Time   :2:53:09 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Student {
	
	Integer rollNumber;
	String name;
	Double marks;
	
	//Generating Constructors
	public Student(Integer rollNumber, String name, double marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	//Generating Getters
	public Integer getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}
	
	
	

}
