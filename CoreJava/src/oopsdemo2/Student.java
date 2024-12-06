package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :9:54:59 am
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to demonstrate Aggregation - Student Class with Address object >> HAS - A Relationship

*/

public class Student {
	
	private int rollNo;
	private String name;
	
	private Address ad;     //Entity Reference- Aggregation- HAS Relationship
	
	public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
	
	void display() {
		System.out.println("-----------Student Details ------------");
		System.out.println("StudentId     :"+rollNo);
		System.out.println("Student Name  :"+name);
		
		System.out.println("Address       :"+ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
	}
	
	
}
