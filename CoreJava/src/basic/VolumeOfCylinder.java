package basic;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		/* 
		 * Java Program to find Volume of Cylinder
		 */
		 
		 Scanner s=new Scanner(System.in);
				float a,h,r;   // variables declaration
				final float PI=3.14f; // constant declaration
				
				System.out.println("Enter radius of a Cylinder :");
				r=s.nextFloat();// float input
				System.out.println("Enter height of a Cylinder :");
				h=s.nextFloat();// float input


				
				a=PI*r*r*h;  // calculate Volume of cylinder
				
				System.out.println("The Volume of Cylinder is : "+a);
				System.out.format("%.2f", a);
				
				s.close();


	}

}
