package oopsdemo2;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :10:15:59 am
*Email  :Mekapothula.Reddy@coforge.com
*/


//Aggregation Example
public class Publisher {
	
	  String name;
	  String publisherID;
	  String city;
	  
	  public Publisher(String name, String publisherID, String city) {
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}

	public String toString() {
		return "Publisher [name=" + name + ", publisherID=" + publisherID + ", city=" + city + "]";
	}
	  
	  
	  
	  


}
