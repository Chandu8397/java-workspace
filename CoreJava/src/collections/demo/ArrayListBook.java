package collections.demo;

import java.util.ArrayList;
import java.util.List;

/**
*Author :Mekapothula.Reddy
*Date   :5 Nov 2024
*Time   :2:54:24 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Java Program to store & display User-defined Book Objects in Collections
*/

public class ArrayListBook {

	public static void main(String[] args) {
		
		 //Creating Books  object & initialized using Book Constructor
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","Wiley",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        
        List<Book> bookList=new ArrayList<>();
        
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(new Book(104, "Java made Simple", "James Gosling", "Prime", 15));
        
        //Traverse in List
        System.out.println("***** Book List *****");
        for(Book i:bookList) {
        	System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        }
        
        System.out.println("The Total No.of Books is: "+bookList.size());
        
        //Find book by publisher
        String pub="Wiley";
        for(Book i: bookList) {
        	if(i.getPublisher().equalsIgnoreCase(pub)) {
        		System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
        	}
        	
        }
        
        }

}
