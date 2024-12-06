package oopsdemo2;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :28 Oct 2024
*Time   :11:47:42 am
*Email  :Mekapothula.Reddy@coforge.com
*Main class for testing Shopping Cart . Customer --> ShoppingCart
*/

public class ShoppingApplication {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
        System.out.println("********** Online Shopping Portal ************");
        System.out.println("Enter Customer Name & Email : ");
        scanner.close();

		
		ShoppingCart cart1 =new ShoppingCart("Mary John","mary@wipro.com");

        //Add items to Cart
        cart1.addItem("Boat Ear Buds");            //Invoke method addItem() for Object cart1
        cart1.addItem("Logitech Mouse");
        cart1.addItem("Samsung HDD");
        cart1.addItem("HP Laser Printer");
        cart1.addItem("Pen drive");
        cart1.addItem("HDMI Convertor");


        System.out.println("Customer Details :");
        cart1.display();                            //Base class method
        System.out.println("Cart Details :");
        cart1.displayCart();

		
		

	}

}
