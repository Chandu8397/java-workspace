package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :12:28:06 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class OverLoadDemo {

	public static void main(String[] args) {
		
		Addition ad1= new Addition(33,45);
		
		//Invoke OverLoad Methods
		ad1.add();
		ad1.add(999);
		ad1.add(88,99);
		ad1.add(450, 35.05f);
		ad1.add("Chandu","Reddy");
		ad1.add(20.50f, 67.89f);    //Type promotion- calls method with double type parameters
		ad1.add(9, 8, 7);

	}

}
