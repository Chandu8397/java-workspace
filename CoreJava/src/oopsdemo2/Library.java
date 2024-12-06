package oopsdemo2;

import java.util.List;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :11:41:15 am
*Email  :Mekapothula.Reddy@coforge.com
*/

//Composition Example
public class Library {
	
	private List<Book> books;  //Compostion - Library has book reference object

	public Library(List<Book> books) {
		this.books = books;
	}

	//Generating Getters
	public List<Book> getBooks() {
		return books;
	}

		
	
	

	
	
}
