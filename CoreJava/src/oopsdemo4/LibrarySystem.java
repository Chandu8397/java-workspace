package oopsdemo4;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :12:56:19 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class LibrarySystem {

	public static void main(String[] args) {
		
		Library library= new Library();
		
		library.displayItems();
		
		library.borrowItem("1984");
		library.borrowItem("The Great Gatsby");
		library.returnItem("1984");

		library.displayItems();
	}

}
