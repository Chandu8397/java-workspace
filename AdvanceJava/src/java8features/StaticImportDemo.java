package java8features;

/**
*Author :Mekapothula.Reddy
*Date   :9 Nov 2024
*Time   :3:44:12 pm
*Email  :Mekapothula.Reddy@coforge.com
*/
import static java.lang.System.*;
import static java.lang.Math.*;


public class StaticImportDemo {

	public static void main(String[] args) {
	
		//Calling Predefined methods without static import
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2,2));
		System.out.println(Math.abs(6.3));
		
		//calling of predefined methods with static import
		out.println(sqrt(4));
		out.println(pow(2,2));
		out.println(abs(6.3));

	}

}
