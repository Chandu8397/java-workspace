package oopsdemo4;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :10:51:52 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Square extends Shape {
	private final double side;
	
	public Square(Double side) {
		this.side = side;
	}



	@Override
	public Double CalculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
