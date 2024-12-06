package tollgate;

/**
*Author :Mekapothula.Reddy
*Date   :12 Nov 2024
*Time   :9:20:11 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class TestToolBooth {

	public static void main(String[] args) {
			TollBooth booth = new HyderabadTollBooth();
			 
			Truck ford = new FordTruck(4, 12500, null); 
			Truck nissan = new NissanTruck(6, 5000, null); 
			Truck daewoo = new DaewooTruck(8, 17000, null);
			 
			booth.calculateToll(ford);
			booth.calculateToll(nissan);
			booth.calculateToll(daewoo);
			 
			booth.collectReceipts();
			}
			}