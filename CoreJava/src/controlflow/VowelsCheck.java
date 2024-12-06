package controlflow;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :25 Oct 2024
*Time   :9:19:28 am
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to count Vowels in a String
*/

public class VowelsCheck {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		String sentence;
		
		System.out.println("Enter a Sentence");
		sentence = scanner.nextLine();
		
		String sentence1 =sentence.toLowerCase();
		int count=0;
		scanner.close();
		
		for (int i=0; i < sentence.length(); i++)
		{
			if(sentence1.charAt(i)== 'a' || sentence1.charAt(i)== 'e' ||
					sentence1.charAt(i)== 'i' || sentence1.charAt(i)== 'o' || sentence1.charAt(i)== 'u');
			{
				count = count + 1;
			}
		}
		System.out.println("The Total no.of Vowels in \""+sentence+"\" is :"+count);
			}

}
