package controlflow;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :4:18:58 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class DoWhileDemo {

	public static void main(String[] args) {
		
		int i=1;
		
		//Do-while Loop executes at least once, even if condition is false
		
		do {
			System.out.println(i);
			i = i+1;
		}
		while(i>5);                                //Condition is False
		System.out.println("Loop Terminated"); 
		}

}
