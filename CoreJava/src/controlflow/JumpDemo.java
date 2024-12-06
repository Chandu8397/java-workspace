package controlflow;

/**
 *Author :Mekapothula.Reddy
 *Date   :25 Oct 2024
 *Time   :9:48:04 am
 *Email  :Mekapothula.Reddy@coforge.com
 *
 *Program to demonstrate break & Continue  
 */

public class JumpDemo {

	public static void main(String[] args) {

		int i;	
		System.out.println("***** Break statement Demo *****");
		for (i = 1; i <=10; i++) {
			if(i==5) break;        //terminate loop
		System.out.println(i);
		}

		System.out.println("***** Continue Statement Demo  *****");
		for (i=1; i <=10; i++) {
			if(i>4 && i<9) continue;   //skips the current iteration
        System.out.println(i);
		}
	}

}
