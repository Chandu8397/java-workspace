package controlflow;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :2:41:24 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*program can display numbers from 1 t0 10 and 10 to 1
*Display your name 10 times
*/

public class Disp1to10 {

	public static void main(String[] args) {
		
		//loop Initialiation
		int i=1;
		System.out.println("***** Forward Loop *****");
		
		
		//set Condition to loop
		while(i<=10) {
		    System.out.println(i+ "-Chandu");
		    
		//Increment the loop
		    i= i+1;
	}
	System.out.println("***** Reverse Loop *****");
	
	int j=20;
	
	while(j>=1) {
		System.out.println(j+ "\t");
		j=j-1;
	}
		
	}
}
		



