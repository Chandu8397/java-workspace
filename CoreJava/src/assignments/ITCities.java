package assignments;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :10:01:32 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*To Check wheather the city is IT City or Not
*/

public class ITCities {

	public static void main(String[] args) {
		String City;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a City Name");
		City=scan.next();
		
		if(City.equalsIgnoreCase("Noida") || City.equalsIgnoreCase("Mumbai") || 
				City.equalsIgnoreCase("Pune") || City.equalsIgnoreCase("Gurgaon")) 
		{
			System.out.println(City+" is a IT City");
		}
		else
		{
			System.out.println(City+" is Not a IT City");
		}
		scan.close();
		}
}
