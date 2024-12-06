package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :2:43:23 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class OverrideDemo {

	public static void main(String[] args) {
		
		SBI sbiBank= new SBI("SBI");
		Axis axisBank= new Axis("Axis");
		ICICI iciciBank= new ICICI("ICICI");
		
		sbiBank.display();  //Invokes ClassMethod
		//Invokes Overridden Method
		System.out.println("\tThe Interest Rate is :"+sbiBank.getRateofInterest()+"%");
		
		axisBank.display();  
		//Invokes Overridden Method
		System.out.println("\tThe Interest Rate is :"+axisBank.getRateofInterest()+"%");
		
		iciciBank.display();  //Invokes ClassMethod
		//Invokes Overridden Method
		System.out.println("\tThe Interest Rate is :"+iciciBank.getRateofInterest()+"%");
	}

}
