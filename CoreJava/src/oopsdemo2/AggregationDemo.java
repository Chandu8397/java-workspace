package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :10:08:31 am
*Email  :Mekapothula.Reddy@coforge.com
*
*Implementing HAS-A Relationship
*/

public class AggregationDemo {

	public static void main(String[] args) {
		
		Address ad1= new Address("Bengaluru", "Karanataka", "India", 566016);
		Address ad2= new Address("Prague", "Austin", "Czech Republic", 9876);
		
		Student s1= new Student(101, "Chandu", ad1);
		Student s2= new Student(102, "Reddy", ad2);
		
		s1.display();
		s2.display();

		

	}

}
