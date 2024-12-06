package collections.demo;

/**
*Author :Mekapothula.Reddy
*Date   :5 Nov 2024
*Time   :2:52:25 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Book {
	
	int id;
    String name,author,publisher;
    int quantity;
    
    //Generating Constructors
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	//Generating Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getQuantity() {
		return quantity;
	}

		
	
	
	
    
    

}
