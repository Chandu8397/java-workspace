package assignments;

//import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :27 Oct 2024
*Time   :7:58:21 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class StudentDetails {
	
	private String name;
	private int yearOfJoining;
	private String address;
	
	
	
	public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}
    	
    public int getYearOfJoining() {
		return yearOfJoining;
	}

    public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

    public String getAddress() {
		return address;
	}


    public void setAddress(String address) {
		this.address = address;
	}


    public void displayInfo() {
		System.out.println(this.getName()+ " "+this.getYearOfJoining()+ " " +this.getAddress());
	}

	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", yearOfJoining=" + yearOfJoining + ", address=" + address + "]";
	}
	
	
	
}