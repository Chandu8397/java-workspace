package controlflow;

import java.util.Scanner;

public class Sumaverage {

	public static void main(String[] args) {
		
		int a,b,c,sum=0;
		float avg;
		Scanner scanner=new Scanner(System.in);
      
		System.out.println("Enter 3 numbers :");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();

		
		
		sum=a+b+c;
		avg= (float) sum/3;
		
		System.out.println("The Sum of 3 numbers is       : "+sum);
		System.out.println("The Avg of 3 numbers is       : "+avg);
		System.out.println("The Avg of 3 numbers is       : "+String.format("%.2f", avg));
scanner.close();
		
        }

}
