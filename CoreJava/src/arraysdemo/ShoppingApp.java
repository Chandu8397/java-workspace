package arraysdemo;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :4:30:40 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Code to create Simple Online Shopping App .
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/

public class ShoppingApp {

	public static void main(String[] args) {
		
		String userInput=null;
		Scanner scanner=new Scanner(System.in);
		
		String[] products= {"Logitech Mouse", "Boat earbuds", "Hp gaming laptop", 
				              "Samsung HDD", "Philips Magic light", "Hp Printer"};
		
		String[] cart= new String[products.length];
		int cartIndex=0;;
		
		
		
		do {
			//Display the Shopping Items
			System.out.println("Welcome To Our Online Shopping App");
			System.out.println("1.view products");
			System.out.println("2.Add Products");
			System.out.println("3.Check Out");
			System.out.println("4.Exit");
			
			System.out.println("Enter Your Choice");
			int Choice=scanner.nextInt();
			
			switch(Choice) {
			case 1:
				System.out.println("Displaying Products .....");
				for (int i = 0; i < products.length; i++) {
					System.out.println((i+1)+". "+products[i]);
				}
				break;
				
			case 2:
				System.out.println("Adding Products .....");
				System.out.println("Enter Product Number to Add to Cart: ");
				int pno= scanner.nextInt();
				if(pno >0 && pno <= products.length) {
					cart[cartIndex++]=products[pno-1];
					System.out.println("Product Added to cart");
				}
				else {
					System.out.println("Invalid Product Number");
				}
				break;
				
			case 3:
				System.out.println("Checking Out  .....Your Cart Contents");
				for (int i =0; i < cartIndex; i++) {
					System.out.println((i+1)+" . "+cart[i]);
				}
				
				break;
																	//Exit Switch-Case
				
			case 4:
				System.out.println("Return GoodBye!  ....."); 
				break; 
				
			default:
				System.out.println("Invalid choice. Please try Again");
				
			}
			System.out.println("Do You Want To Continue Shopping ? (Yes/No) :");
			userInput=scanner.next();
		}
		while(userInput.equalsIgnoreCase("Yes"));
		
		System.out.println("Thanks For Shopping With Us !!!");
		scanner.close();
		}

}
