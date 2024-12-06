package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :3:00:38 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class OverrideDemo2 {

	public static void main(String[] args) {
		
		ElectronicsProduct ep1= new ElectronicsProduct("Laptop", 999.90,"Dell", "Latitude");
		ClothingProducts cp1= new ClothingProducts("TShirt", 15.50f,"Medium", "Indigo");
		
		System.out.println("****** Electronics Products Details ******");
		ep1.displayDetails();
		
		System.out.println("****** Clothing Products Details ******");
		cp1.displayDetails();

	}

}
