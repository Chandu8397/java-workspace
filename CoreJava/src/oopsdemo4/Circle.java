package oopsdemo4;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :10:47:09 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Circle extends Shape {
	private final double radius;
	
	public Circle(Double radius) {
		this.radius= radius;
		
	}

	@Override
	public Double CalculateArea() {
		return radius*radius*Math.PI;
	}
}
