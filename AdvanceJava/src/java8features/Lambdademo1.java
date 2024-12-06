package java8features;

/**
*Author :Mekapothula.Reddy
*Date   :8 Nov 2024
*Time   :12:24:59 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Lambdademo1 {

	public static void main(String[] args) {
		
		NumericTest isEven=(n) -> (n%2==0);
		NumericTest isNegative=(n) -> (n<0);
		
		System.out.println("7 is Even Number :" +isEven.computeTest(7));
		System.out.println("-55 is Negative Number :"+isNegative.computeTest(-55));
		
		//boolean a=(n) -> (n%2==0); //Error - lambdaExpression should be stored in instance of FI

		

	}

}
