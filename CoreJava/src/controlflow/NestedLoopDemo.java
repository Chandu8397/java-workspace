package controlflow;

/**
*Author :Mekapothula.Reddy
*Date   :25 Oct 2024
*Time   :10:04:27 am
*Email  :Mekapothula.Reddy@coforge.com
*
*Program for Nested Loop 
*/

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		//Outer Loop
		for (int i = 1; i<=5; i++) {            //1 2 3 4 5 = 5
			
			//NestedLoop/inner Loop executes based on value of i
			for(int j = 1; j<=5; j++) {
				System.out.print("*"+"\t");   //5 5 5 5 5 = 25
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		//Outer Loop
				for (int i = 1; i<=5; i++) {            //1 2 3 4 5 = 5
					
					//NestedLoop/inner Loop executes based on value of i
					for(int j = 1; j<=i; j++) {
						System.out.print("*"+"\t");   //5 5 5 5 5 = 25
					}
					System.out.println();
				}
				System.out.println("------------------");
				
				//Outer Loop
				for (int i = 1; i<=5; i++) {            //1 2 3 4 5 = 5
					
					
					for(int j = 1; j<=i; j++) {
						System.out.print(j+"\t");   //5 5 5 5 5 = 25
					}
					System.out.println();
				}
				System.out.println("------------------");


		

	}

}
