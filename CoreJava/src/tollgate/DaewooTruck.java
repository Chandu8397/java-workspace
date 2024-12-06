package tollgate;

/**
 *Author :Mekapothula.Reddy
 *Date   :12 Nov 2024
 *Time   :7:49:24 am
 *Email  :Mekapothula.Reddy@coforge.com
 */


public class DaewooTruck implements Truck {

	private final int axles;
	private final int weight;
	private final String Company;

	public DaewooTruck(int axles, int weight, String Company) {
		this.axles = axles;
		this.weight = weight;
		this.Company= Company;
	}

	@Override
	public int getAxles() {
		return axles;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	public String getCompany() {
		return "Daewoo";
	}
}
