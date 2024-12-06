package oopsdemo2;


/**
*Author :Mekapothula.Reddy
*Date   :28 Oct 2024
*Time   :2:30:49 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class DoctorHierarchicalTest {

	public static void main(String[] args) {
		
		 Specialist specialistDoctor=new Specialist(10001,"Mary King","Bengaluru","Cardiologist", null);

			//NonSpecialist nonSpecialistDoctor=new NonSpecialist(20001,"Gavin King","Melbourne");
			NonSpecialist nsp=new NonSpecialist(20001,"Gavin King","Melbourne");

			specialistDoctor.display();
			nsp.display();

	}

}