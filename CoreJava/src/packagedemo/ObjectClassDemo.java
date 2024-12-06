package packagedemo;

/**
*Author :Mekapothula.Reddy
*Date   :4 Nov 2024
*Time   :4:52:05 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ObjectClassDemo {

	public static void main(String[] args) {
		
		Person p1= new Person("Chandu", 22);
		Person p2= new Person("Chandu", 22);
		
		Person p3= new Person("Reddy", 24);
		
		System.out.println("Person1: "+p1.toString());
		System.out.println("Person3: "+p3);
		
		System.out.println("Person1 equals Person2: "+p1.equals(p2));
		System.out.println("Person2 equals Person3: "+p2.equals(p3));
		
		System.out.println(p1.hashCode());  //Using hashcodes
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println("class of person1 :"+p1.getClass().getName());  
		
	}

}
