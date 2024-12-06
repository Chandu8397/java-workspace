package controlflow;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :11:46:25 am
*Email  :Mekapothula.Reddy@coforge.com
*
*program to find max of 2 numbers in Ternary operator
*/

public class TerinaryDemo1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,result;
		
		System.out.println("Enter 2 Numbers: ");
		num1=Integer.parseInt(br.readLine());
		num2=Integer.parseInt(br.readLine());
		
		String msg = (num1 > num2) ? "Num1 is Greatest":"Num2 id Greatest";
		System.out.println(msg);
		
		result = (num1 > num2) ? num2:num1;
		System.out.println(result);
		


		
		

	}

}
