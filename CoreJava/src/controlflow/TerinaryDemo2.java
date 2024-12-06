package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :11:59:34 am
*Email  :Mekapothula.Reddy@coforge.com
*
*/

public class TerinaryDemo2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	char myChar;
        

        System.out.println("Enter a Character :");
        myChar =br.readLine().charAt(0);
        

        //Ternary Operator to check Simple Conditions
        String msg =(myChar >= 'a' && myChar <='z' || myChar >= 'A' && myChar <='Z' ) ?
        myChar+" is an Alphabet": myChar+" not an Alphabet";

        System.out.println(msg);


	}

}
