package controlflow;
import java.io.*;

/*
 * Java program to check if the user is eligible for a discount or not.
 * If the user's age is less than 18 or they are not a member, they are eligible for a discount.
 * Otherwise, they are not eligible for a discount.
 */

public class Discount {

	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String name;
		int age;
		boolean isMember;
		
		//Ask user for Membership status
		System.out.println("Enter your Name :");
		name=br.readLine();
		System.out.println("Enter your Age :");
		age= Integer.parseInt(br.readLine());
		System.out.println("Are you a Member ? : (true/false)");
		isMember= Boolean.parseBoolean(br.readLine());
		
		//check if type user eligible for discount
		if(age < 18 || !isMember) {
			System.out.println(name+ "is Eligible for Discount !!!");
		}
		else {
			System.out.println(name+ "is Not eliguble for Discount !!!");
		}
		
	}

}
