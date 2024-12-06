package java8features;

/**
*Author :Mekapothula.Reddy
*Date   :8 Nov 2024
*Time   :2:24:47 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

//Perform Arithmetic Operations Using Lambda
public class LambdaDemo3 {

	public static void main(String[] args) {
		
		Addition op1= (a,b) -> (a+b);
		//int c=(a,b) -> (a+b);
		System.out.println("Addition of 2 No's is:" +op1.calculate(200, 155));
		
		Addition op2=(a,b) -> (a-b);
		System.out.println("Subtraction of 2 Nos is : "+op2.calculate(200, 155));
		
		Addition op3=(a,b) -> (a*b);
		System.out.println("Multiplication of 2 Nos is : "+op3.calculate(200, 155));
		
		Addition op4=(int a,int b) -> (a/b);
		System.out.println("Division of 2 Nos is : "+op4.calculate(200, 155));
		
		// lambda expression with single parameter with no parenthesis
				MyString myName1 = name -> { return "Hello "+name;};
				
				System.out.println(myName1.myStringFunction("James Gosling"));
		
		//To perform Modulus
		Addition op5=(int a,int b) -> (a%b);
		System.out.println("Modulus of 2 Nos is : "+op5.calculate(200, 155));
	
	
	}
}
