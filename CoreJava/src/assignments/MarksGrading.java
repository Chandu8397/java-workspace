package assignments;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :10:16:37 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Grade using follwing criteria A,B,C,D,E
*/

public class MarksGrading {

	public static void main(String[] args) {
		int Score;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Score :");
		Score = scan.nextInt();
		
		if (Score < 0 || Score >100) {
		System.out.println("Invalid Score. Enter Number between 0 and 100");
		}
		
		else if(Score >= 90) {
			System.out.println("Your Grade is A ");
			}
		
		else if(Score >= 80) {
					System.out.println("Your Grade is B ");
				}
		
		else if(Score >= 70) {
			System.out.println("Your Grade is C ");
		}
		
		else if(Score >= 60) {
			System.out.println("Your Grade is D ");
		}
		
		else {
			System.out.println("Your Grade is F ");
		}
		
		scan.close();
		
	}

}
