package controlflow;

/**
*Author :Mekapothula.Reddy
*Date   :24 Oct 2024
*Time   :3:25:12 pm
*Email  :Mekapothula.Reddy@coforge.com
*Program to display Odd & Even numbers in following format
* 
* ODD	EVEN
* ---	----
* 1		2
* 3		4
* 5		6
* 7		8
* 9		10
*/

public class DisplayOddEven {

	public static void main(String[] args) {
		
		int i=1;
		System.out.println("Odd\tEven");
		System.out.println("---\t---");
		
		while(i<=20) {
			
			if(i % 2 == 1) {
				System.out.print(i+"\t");
			}
			else {
			System.out.println(i);
			}
			i=i+1;
		
		}
	}
}
