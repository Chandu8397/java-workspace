package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :2:52:06 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Product {
	
	private String name;
    private double price;
    
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Method to Display product details
	public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
    
}
