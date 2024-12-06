package arraysdemo;

/**
*Author :Mekapothula.Reddy
*Date   :25 Oct 2024
*Time   :12:10:23 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*		//Define array reference "marks" & Create array of int to hold 10 values
*/

public class ForEachDemo {

	public static void main(String[] args) {

				int[] marks= {78,45,80,22,60,66,90,35,55,59};
				
				String[] name= {"Jack","Mike","Mary","James","Ron"}; //Declare fixed Array
				
				float[] scores;
				scores=new float[5]; //Array to store scores 
				
				//Initialize Array Elements -Input
				scores[0]=34.45f;
				scores[1]=80.50f;
				scores[2]=55.00f;
				scores[3]=89.00f;
				scores[4]=70.50f;
				
				System.out.println("Interger Array Displayed For-Each Loop : ");
				for(int i:marks) {
					System.out.println(i+"\t");
				}
				System.out.println();
				
				System.out.println("String Array Displayed For-Each Loop : ");
				for(String i:name ) {
					System.out.println(i+"\t");
				}
				System.out.println();
				
				System.out.println("Float Array Displayed For-Each Loop : ");
				for(float s:scores) {
					System.out.println(s+"\t");
				}
				System.out.println();
				
		

	}
}
