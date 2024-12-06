package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :28 Oct 2024
*Time   :10:32:43 am
*Email  :Mekapothula.Reddy@coforge.com
*
*program to demonstarate SingleInheritance
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		//Create Child Class Objects
		Developer d1=new Developer(1111, "Chandu", 5000, "JDBC");
		Developer d2=new Developer(2222, "Honey", 4500, "Hibernet");
		Developer d3=new Developer(3333, "Teja", 6000, "Spring Framework");
		
		d1.display();					//Invokes Base class Method
		d1.displayDeveloperDetails();	//Invokes child class Method
		
		d2.display();
		d2.displayDeveloperDetails();
		
		d3.display();
		d3.displayDeveloperDetails();
		
		//Create Parent class Object
		Employee employee1= new Employee(4444, "Satyam", 4000);
		Employee employee2= new Employee(5555, "Singh", 3500);
		
		System.out.println("********** Normal Employee Details *********");
		employee1.display();
		employee2.display();

		
	}

}
