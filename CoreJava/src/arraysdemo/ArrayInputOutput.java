package arraysdemo;

/**
*Author :Mekapothula.Reddy
*Date   :25 Oct 2024
*Time   :11:52:22 am
*Email  :Mekapothula.Reddy@coforge.com
*
*Progarm to enter elements into Array & Display it
*/

public class ArrayInputOutput {

	public static void main(String[] args) {
		
		//Define arrays reference marks & Create array of int to hold 10 values
		
		int[] marks=new int[10];
		
		String[] name= {"Chandu", "Teja", "Honey", "Satyam", "Siva"};   //Declare fixed array
		
		float[] scores;
		scores= new float[5];                                           //array to store scores
		
		
		
		scores[0]=34.45f;                                               //Iniatialzing array elements  using loop
		scores[1]=80.50f;
		scores[2]=55.00f;
		
		for(int i=0; i< marks.length; i++) {
			marks[i]= i*50;
			
		}
		
		//Output
		System.out.println("******** Interger Array contents ******");
		for(int i =0; i< marks.length; i++) {
		System.out.println(marks[i]+"\t");
		}
	      System.out.println();
	      System.out.println("*********String Array Contents ************");
			for (int i = 0; i < name.length; i++) {
				System.out.print(name[i]+"\t");
			}
			System.out.println();
			
			System.out.println("*********Float Array Contents ************");
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores[i]+"\t");
			}
			System.out.println();
			
			//Iterate in nonLinear
			System.out.println("*********Integer Array Contents in Even Index ************");
			for (int i = 0; i < marks.length; i=i+2) {
				System.out.print(marks[i]+"\t");
			}
			System.out.println();
	}
	

}


