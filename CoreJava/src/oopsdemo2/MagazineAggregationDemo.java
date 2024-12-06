package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :10:23:14 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class MagazineAggregationDemo {
	
	public static void main(String[] args) {
		
		Author author1= new Author("John", 42,"USA");
		Publisher publisher1= new Publisher("Sun Publications","JDSR-II4", "LA");
		
		Magazine magazine1= new Magazine("The Wolf Street", 800, author1, publisher1);
		magazine1.display();
		
		 
		/*Every Object is independent 
	     In Aggregation, both the entries can survive individually which means 
	     ending one entity will not affect the other entity.
	     */
		System.out.println(author1);
		System.out.println(publisher1);
		System.out.println(magazine1);
		
	}

}
