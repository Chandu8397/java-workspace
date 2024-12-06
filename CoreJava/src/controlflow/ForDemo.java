package controlflow;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :4:56:14 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to Demonstarte For Loop
*/

public class ForDemo {

	public static void main(String[] args) {
		
		System.out.println("***** Display 1 - 10 *****");
		for (int i = 1; i <=10; i++) {
			System.out.println(i+"\t");
			}
		System.out.println();
		
		System.out.println("***** Display 10 - 1 *****");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i+"\t");
			}
		System.out.println();
		
		System.out.println("***** Display Name 10 Times *****");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Chandu Reddy");
			}
		

	}

}
