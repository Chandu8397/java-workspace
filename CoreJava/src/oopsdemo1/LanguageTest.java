package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :4:25:43 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class LanguageTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Languages l1=new Languages();     //Invokes Default constructor
		
		Languages l2=new Languages("Scala");     //Invokes Single parameterized constructor with string
		Languages l3=new Languages("Ruby");
		
		Languages l4=new Languages(3.5f);       //Invokes Single parameterized constructor with float
		
		Languages l5=new Languages("C#", 9.08f);  //Invokes Constructor with 2 parameters
		Languages l6=new Languages("Swift", 5.2f);
		
		

	}

}
