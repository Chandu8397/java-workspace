package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :11:48:18 am
*Email  :Mekapothula.Reddy@coforge.com
*
*Code to create Simple Online Shopping App to View,Add & Check out Products.
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/
class Lamp{
	//Stores status of Lamp
		private boolean isOn;
		
		//Default Constructor - 
		//Compiler Creates it for Automatic initialization of Object Properties
		
		//Method to turn On the Lamp
		public void turnOn() {
			isOn=true;
			System.out.println("Light On ? : "+isOn);
		}
		//Method to turn Off the Lamp
			public void turnOff() {
				isOn=false;
				System.out.println("Light On ? : "+isOn);
			}
}


public class LampTest {

	public static void main(String[] args) {
		
		Lamp led= new Lamp();
		Lamp halogen= new Lamp();
		
		//switch ON Led & halogen
		led.turnOn();
		halogen.turnOn();
		
		//switch Off Led & halogen
		led.turnOff();
		halogen.turnOff();
		}

}
