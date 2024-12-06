package oopsdemo4;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :11:52:24 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Director extends Employee {
	
	private double transportAllowance;

	public Director(String name, double basic, String address, double transportAllowance ) {
		super(name, basic, address);
		this.transportAllowance= transportAllowance;
	}

	@Override
	double totalPay() {
		double totalAmount = 0;
	       double houseRentAllowance = (basic * 0.20);
	       double dearnessAllowance = (basic * 0.5);
	       double medicalAllowance = 4500;
	       double entertainmentAllowance = 5000;
	       totalAmount = basic + houseRentAllowance + dearnessAllowance
	             + medicalAllowance + entertainmentAllowance + transportAllowance;
	       return totalAmount;
		
		
	}
}
