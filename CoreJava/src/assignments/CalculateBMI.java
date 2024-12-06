package assignments;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :9:36:34 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*calculating The BMI 
*Formula: BMI=weight/(height*height)
*/

public class CalculateBMI {

	public static void main(String[] args) {
		float BMI, Weight, Height;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Weight");
		System.out.println("Enter the Height");
		Weight=scan.nextFloat();
		Height=scan.nextFloat();
		BMI = Weight/(Height*Height);
		
		System.out.println("The BMI is: "+BMI);
		scan.close();

	}

}
