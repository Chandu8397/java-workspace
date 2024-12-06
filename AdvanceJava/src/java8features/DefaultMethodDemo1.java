package java8features;

import java.time.LocalDate;

/**
*Author :Mekapothula.Reddy
*Date   :9 Nov 2024
*Time   :11:21:01 am
*Email  :Mekapothula.Reddy@coforge.com
*/

//Java8 allows to add functionality to Interface
//Opps Using Java8

interface Parser{
	default void parse() {
		System.out.println("Default Parsing Logic");
	}
	
	static void displayDate() {          
		System.out.println(LocalDate.now());
	}

}

class TextParser implements Parser{
	void display() {
		System.out.println("Hello Text Parser");
	}
}

class XMLParser implements Parser{
	//Overridden the Parser
	public void parse() {
		System.out.println("Parsing XML Files");
	}
}

public class DefaultMethodDemo1 {

	public static void main(String[] args) {
		
		Parser p =new TextParser();
		p.parse();
		
		TextParser p1= new TextParser();
		p1.display();
		
		p= new XMLParser();
		p.parse();   //Overridden
		
		System.out.println("Program Executed on :");
		Parser.displayDate();
		
		}

}
