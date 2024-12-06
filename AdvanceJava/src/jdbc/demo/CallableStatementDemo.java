package jdbc.demo;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :4:43:52 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class CallableStatementDemo {

	public static void main(String[] args) {
		
		try {
			Skills s= new Skills();
			Scanner scan= new Scanner(System.in);
			
			System.out.println("Enter Candidate Id: ");
			int id= scan.nextInt();
			
			s.getSkills(id);
			scan.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
