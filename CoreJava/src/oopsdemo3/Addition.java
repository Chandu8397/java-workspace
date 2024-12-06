package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :29 Oct 2024
*Time   :12:14:58 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Addition {
	
	private int a,b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void add() {
		System.out.println("***** Meyhod OverLoading *****");
		System.out.println("The Addition of 2 Interger is :"+(a+b));
	}
	
	//Add method is OverLoaded
	public void add(int x) {
		System.out.println("The Addition of Single Number to itself :"+(x+x));
	}
	
	public void add(int x, int y) {
		System.out.println("The Addition of 2 Intergers is : "+(x+y));
	}
	
	public void add(int x, float y) {
		System.out.println("The Addition of Interger & Float Numbers is : "+(x+y));
	}
	
	public void add(String x, String y) {
		System.out.println("The Addition of 2 Strings is : "+(x+y));
	}
	
	public void add(double x, double y) {
		System.out.println("The Addition of 2 Float Numbers is : "+(x+y));
	}
	
	public void add(int x, int y, int z) {
		System.out.println("The Addition of 3 Intergers is : "+(x+y+z));
	}

	


	
	

	
		
}
