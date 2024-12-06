package stringsdemo;

/**
*Author :Mekapothula.Reddy
*Date   :4 Nov 2024
*Time   :12:09:43 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*string Comparision
*/

public class StringComparisionDemo {
	public static void main(String[] args) {
	
	String s1 = "Chandu Reddy";
	String s2 = "Mekapothula";
	
	String s3 = new String("Hello world");
	String s4 = new String("Hello world");

	
	if(s1==s2)            // == Operator checks wheather Strings points to same reference
	{
		System.out.println("Strings are Equal");
	}
	else
	{
		System.out.println("Strings are not Equal");
	}
	
	if(s3.equals(s4))     //equals () method checks
		System.out.println("Strings are Equal");
	else
		System.out.println("Strings are not Equal");
 	}
}
