package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :2:51:54 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ElectronicsProduct extends Product {
	
	private String brand;
    private String model;
    
	public ElectronicsProduct(String name, double price, String brand, String model) {
		super(name, price);
		this.brand = brand;
		this.model = model;
	}
	
	public void display() {
		super.displayDetails();
	
	System.out.println("Brand   : "+brand);
    System.out.println("Model   : "+model);
    System.out.println("Warranty: 1 Year");
	
	}
	

}
