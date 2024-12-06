package logicbuilding;

import java.util.ArrayList;
import java.util.List;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :10:51:45 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Book {
	
	private String title;
	private String author;
	private double price;
	
	//Constructor
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Author     :"+author);
		System.out.println("Title      :"+title);
		System.out.println("Price      :"+price);
	}

	
	
	//Generating Gettters
	public String getAuthor() {
		return null;
	}

	public double getPrice() {
		return 0;
	}
	
}
	
//Child class Library
class Library extends Book {
	
	private List<Book> books;  //Compostion - Library has book reference object

	public Library(String title, String author, double price, List<Book> books) {
		super(title, author, price);
		this.books = books;
	}	
    
	public void addBook(Book book) {
		books.add(book);
		
	}
	
	//Generating Getters
	public List<Book> getBooks() {
		return books;
	}

	public List<Book> getBooksByAuthor(String author){
		List<Book> authorBooks= new ArrayList<>();
		for (Book book : books) {
			if(book.getAuthor().equalsIgnoreCase(author)) {
				authorBooks.add(book);
				
			}
		}
		return authorBooks;
	}
	
	public double getTotalValue() {
		double totalValue = 0;
		for (Book book : books) {
			totalValue += book.getPrice();
		}
		return totalValue;
		
	}
}
	
	
	
	
	


