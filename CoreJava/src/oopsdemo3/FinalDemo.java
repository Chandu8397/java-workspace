package oopsdemo3;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :9:39:51 am
*Email  :Mekapothula.Reddy@coforge.com
*/
class MyDemo{
	
	private static int MAX_AGE=65; //Final Variable
	private int age=21;
	
	public void test() {
		MAX_AGE=60;
		}
	//final Method
	public final void test1() {
		System.out.println("The Age is : "+age);
	}
}

class MyTemp extends MyDemo{
	
	/*
	 * public void test1() { System.out.println("The Age is :"+age); }
	 */
}

final class Hello{
	int a,b;

	public Hello(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Hello [a=" + a + ", b=" + b + "]";
	}
}

/*
 * class World extends Hello{ //Final Classes cannot be extended
 * 
 * }
 */
public class FinalDemo {

	public static void main(String[] args) {
		
		
		

	}

}
