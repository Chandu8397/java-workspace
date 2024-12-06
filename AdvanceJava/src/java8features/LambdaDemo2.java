package java8features;

/**
*Author :Mekapothula.Reddy
*Date   :8 Nov 2024
*Time   :12:36:46 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

//Block Lambda Expressions
public class LambdaDemo2 {

	public static void main(String[] args) {
		
		MyString reverseStr = (str) -> {
			String result="";
			for(int i=str.length()-1; i>=0; i--)
				result+=str.charAt(i);
			return result;
		};
		
		System.out.println(reverseStr.myStringFunction("Lambda Expressions"));
		System.out.println(reverseStr.myStringFunction("madam"));
		System.out.println(reverseStr.myStringFunction("Hello World Java"));
		
		//lambda expression with single parameter
		
		MyString myName = (name) -> {return "Hello"+name;};
		
		System.out.println(myName.myStringFunction("Raj"));
		
		MyString myName1 = (name) -> {return "Hello"+name;};
		
		System.out.println(myName1.myStringFunction("Chandu"));
		
		//Length of the String
		MyString str = (str1) -> {return "The length of String is: "+str1.length();};
		System.out.println(str.myStringFunction("Chandu"));
		System.out.println(str.myStringFunction("Ajay Kumar Reddy Kalakoti"));

	}

}
