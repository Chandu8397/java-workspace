package tollgate;

/**
*Author :Mekapothula.Reddy
*Date   :11 Nov 2024
*Time   :9:21:14 am
*Email  :Mekapothula.Reddy@coforge.com
*/

//FordTruck.java
public class FordTruck implements Truck {
	
private  int axles;
private  int weight;
private String Company;

public FordTruck(int axles, int weight, String Company) {
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
	return Company;
}
}
