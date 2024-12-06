package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :3:30:35 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class UpcastingDemo {

	public static void main(String[] args) {
		
		Item item;
		
		//Upcasting - Child Object is refered by the Parent Object
		item= new Book("Java Programming", 450, "james gosling");
		item.display();
		
		//Switch from One Implement to Another, bcoz of Upcasting
		item= new Laptop("Ideapad", 60000, "Lenova");
		item.display();
		
		
		item= new Book("Python Programming", 650, "Yeshwanth");
		item.display(); //Dynamic Polymorphism

	}

}
