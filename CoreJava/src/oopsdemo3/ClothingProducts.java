package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :2:57:31 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ClothingProducts extends Product {
	
	private String size;
	private String color;
	
	public ClothingProducts(String name, double price, String size, String color) {
		super(name, price);
		this.size = size;
		this.color = color;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		
		System.out.println("Size   : "+size);
        System.out.println("Color  : "+color);
        System.out.println("Material: Cotton");
}
}
