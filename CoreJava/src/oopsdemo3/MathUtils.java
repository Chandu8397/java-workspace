package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :4:51:59 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Static Methods Demo
*
*
*/

public class MathUtils {
	
	public static int square(int num) {
		return num*num;
		
	}
	
	public static int myAddition(int a, int b) {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		
		int result = MathUtils.square(10);        //Using Static method calling by ClassName
		System.out.println("The Square of 5 is :"+result);
		System.out.println("The Addition of 2 Numbers is :"+MathUtils.myAddition(450, 230));

	}

}
