package exceptions.demo;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :3:26:57 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ThrowDemo {
	
	public static void test(int a) {
		if(a==0)
			throw new ArithmeticException("Pass Non Zero Values: By Raj ");
		else
			System.out.println("The Value Passed to Method is :"+a);
	}

	public static void main(String[] args) {
		
		ThrowDemo.test(250);
		ThrowDemo.test(0);
}

}
