package tollgate;

/**
*Author :Mekapothula.Reddy
*Date   :12 Nov 2024
*Time   :7:52:56 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class HyderabadTollBooth implements TollBooth {
	
private int totalTrucks;
private int totalReceipts;
 
@Override
public void calculateToll(Truck truck) {
int toll = 5 * truck.getAxles() + 10 * (truck.getWeight() / 500);
totalReceipts += toll;
totalTrucks++;
System.out.println("Arrival of " + truck.getCompany() + " Truck");
System.out.println("Truck arrival - Axles: " + truck.getAxles() + " Total weight: " + truck.getWeight() + " Toll due: $" + toll);
}
 
@Override
public void displayData() {
System.out.println("Totals since last collection - Receipts: $" + totalReceipts + " Trucks: " + totalTrucks);
}
 
@Override
public void collectReceipts() {
System.out.println("*** Collecting receipts ***");
displayData();
totalReceipts = 0;
totalTrucks = 0;
System.out.println("***** Reset Receipts *****");
displayData();
}
}