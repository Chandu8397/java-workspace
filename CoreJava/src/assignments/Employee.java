package assignments;

/**
*Author :Mekapothula.Reddy
*Date   :27 Oct 2024
*Time   :6:45:49 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Employee {
	private int hoursOfWorkPerDay;
	private double salary;
	
	public void getInfo(int hoursOfWorkPerDay, double salary) {   
		this.hoursOfWorkPerDay= hoursOfWorkPerDay;
		this.salary= salary;
	}
	
	public void addSal() {
		if(this.salary < 500)
			this.salary += 10;
		System.out.println("Salary: "+this.salary);
	}
	
	public void addWork() {
		if (hoursOfWorkPerDay > 6)
			this.hoursOfWorkPerDay += 5;
	System.out.println("hoursOfWorkPerDay: "+this.hoursOfWorkPerDay);
	}
	
	
	
}
