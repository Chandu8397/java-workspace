package packagedemo;

import com.coforge.training.oracle.*;
import com.coforge.training.microsoft.*;

/**
*Author :Mekapothula.Reddy
*Date   :4 Nov 2024
*Time   :3:13:08 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class SoftwareList {
	
	public static void main(String[] args) {
		
		DataBase db1 = new DataBase();
		OperatingSystem os1 = new OperatingSystem();
		
		System.out.println("********* Database Softwares ******");
		db1.printSoftware();
		
		System.out.println("********* Operating System ********");
		os1.listSoftware();
		
		
		
		
	}

}
