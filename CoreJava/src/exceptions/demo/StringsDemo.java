package exceptions.demo;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :2:51:29 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

//program to handle Null Pointer Exception
public class StringsDemo {

	private static String s2;

	public static void main(String[] args) {
	
		String s1="Hello World";
		        s2 = null;
		       
		        // String s2="Java";
		        try{
		            System.out.println(s1.length());
		            System.out.println(s2.length());
		        }
		        catch (Exception exception){
		            System.err.println("Exception occurred:"+exception);
		        }

	}

}
