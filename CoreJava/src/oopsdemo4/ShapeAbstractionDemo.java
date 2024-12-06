package oopsdemo4;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :10:53:50 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ShapeAbstractionDemo {

	public static void main(String[] args) {
		
		Shape s;
		s= new Circle(9.45);
		System.out.println("The Area of Circle is :"+s.CalculateArea());
		
		s= new Square(5.0);
		System.out.println("The Area if Square is : "+s.CalculateArea());
		
		}

}


