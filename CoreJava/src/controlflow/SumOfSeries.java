package controlflow;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :3:08:27 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*program to find sum of series 1+2+3+....n
*/

public class SumOfSeries {

	public static void main(String[] args) {
		
		int num,i=1,sum=0;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter a limit");
		num=scan.nextInt();
		scan.close();
		
		while(i<=num) {
			sum = sum+1;
			i=i+1;
		}
		System.out.println("The Sum of Series is:"+sum);
		
		}

}
