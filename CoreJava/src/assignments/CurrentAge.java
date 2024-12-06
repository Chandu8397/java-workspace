package assignments;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :9:24:57 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*To calculate Current Age
*/

public class CurrentAge {

	public static void main(String[] args) {
		int Birth_year, Current_year=2024, Current_age;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Birth Year");
		Birth_year=scan.nextInt();
		Current_age=Current_year - Birth_year;
		System.out.println("The Current age is: "+Current_age);
		
		scan.close();
			
		}
		

	}
