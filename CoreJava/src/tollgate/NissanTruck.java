package tollgate;

/**
*Author :Mekapothula.Reddy
*Date   :12 Nov 2024
*Time   :7:46:57 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class NissanTruck implements Truck {
	
		private final int axles;
		private final int weight;
		private final String Company;
		 
		public NissanTruck(int axles, int weight, String Company) {
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

		@Override
		public String getCompany() {
			return "Nissan";
		}
		}


