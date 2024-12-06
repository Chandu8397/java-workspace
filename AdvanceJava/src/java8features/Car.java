package java8features;

/**
*Author :Mekapothula.Reddy
*Date   :9 Nov 2024
*Time   :11:40:28 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Car implements Vehicle{
	
	private String brand;

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "Car is Speeding up !!!";
	}

	@Override
	public String slowDown() {
		return "Car is Slowing Down !!!";
	}

	
}
