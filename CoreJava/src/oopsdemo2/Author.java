package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :10:14:31 am
*Email  :Mekapothula.Reddy@coforge.com
*
*Program for Aggregation >Author-->Publisher-->Magazine-->MagazineAggregationDemo
*/
//Aggregation Example 
public class Author {
	
	String authorName;
	int age;
	String place;
	
	
	public Author(String authorName, int age, String place) {
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	public String toString() {
		return "Author [authorName=" + authorName + ", age=" + age + ", place=" + place + "]";
	}
	
	
	
	

	
	
	

}
