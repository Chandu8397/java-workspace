package controlflow;

import java.util.Scanner;

public class Greatest3 {

			public static void main(String[] args) {
				
				int num1,num2,num3=0;
			
				Scanner scanner=new Scanner(System.in);
		      
				System.out.println("Enter 3 numbers :");
				num1=scanner.nextInt();
				num2=scanner.nextInt();
				num3=scanner.nextInt();
				
				if (num1 > num2 && num1 > num3)
				{
					System.out.println(num1+"is Greatest");
				}
				else if(num2>num3) {
					System.out.println(num2+"is Greatest");
				}
				else if(num1 == num2 && num1 == num3) {
					System.out.println("All Numbers are Equal");
				}
				else {
					System.out.println(num3+ "is Greatest");
				}
				scanner.close();
				}
}


