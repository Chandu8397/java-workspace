package java8features;

/**
*Author :Mekapothula.Reddy
*Date   :9 Nov 2024
*Time   :11:44:13 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class DefaultMethodDemo2 {

	public static void main(String[] args) {
			
		Vehicle car = new Car("BMW");
		
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		System.out.println(car.turnAlarmOff());
		System.out.println(car.turnAlarmOn());
		
		System.out.println(Vehicle.getHorsePower(2500, 400));


		
	}

}
