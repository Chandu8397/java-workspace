package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :2:36:15 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ConstructorDemo {

	int id;
	String name;
	float salary;
	
	
	//NoArgs Constructor
	public ConstructorDemo() {
		System.out.println("No-Args Constructor");
		this.id=1001;
		this.name="chandu";
		this.salary=5000.00f;
	}
	
	//Parameterized constructor
	public ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

		public void name() {
		System.out.println("Iam a Display Method");
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}

		public static void main(String[] args) {
			
			ConstructorDemo cd1= new ConstructorDemo();   //Invokes No-Args Constructor
			ConstructorDemo cd2= new ConstructorDemo(1002,"Honey", 75000.00f);  //Invokes Parameterized Constructor
			ConstructorDemo cd3= new ConstructorDemo();
			ConstructorDemo cd4= new ConstructorDemo(1003,"king", 3500.00f);
			
			
			cd1.name();
			cd2.name();
			cd3.name();
			cd4.name();


			

	}
	

}
