package controlflow;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter 2 numbers : ");
		a=scan.nextInt();
		b=scan.nextInt();
		 
		if(a > b) {
			System.out.println(a+" Is Greatest ");
		}
		else {
			System.out.println(b+" Is Greatest ");
		}
		scan.close();
	}

}
