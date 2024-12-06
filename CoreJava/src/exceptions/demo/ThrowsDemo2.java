package exceptions.demo;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :4:24:01 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ThrowsDemo2 {

	public static void main(String[] args) {
		
	        Product product1=new Product("Laptop",50000);
	        System.out.println("Product Created :"+product1.getName()+" "+product1.getPrice());

	        Product product2=new Product("Cell Phone",25000);
	        System.out.println("Product Created :"+product2.getName()+" "+product2.getPrice());
	        
	        try {
	        	product1.applyDiscount(50);
	        	System.out.println("The Discount Price Of :"+product1.getName()+" "+product1.getPrice());
	        	
	        	product2.applyDiscount(120);
	        	System.out.println("The Discount Price Of :"+product2.getName()+" "+product2.getPrice());
	        }
	        catch (IllegalArgumentException e) {
	        	System.err.println("Error :"+e.getMessage());
	        }

	}

}
