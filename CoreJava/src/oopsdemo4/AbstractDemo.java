package oopsdemo4;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :11:41:06 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class AbstractDemo {

	public static void main(String[] args) {
	
		Trainee trainee1= new Marks("Chandu", "NewYork", 10001, 44);
		
		System.out.println("trainee1");
		
		double result = trainee1.calculateMarks();
		System.out.println("Final Marks :"+result);

	}

}
