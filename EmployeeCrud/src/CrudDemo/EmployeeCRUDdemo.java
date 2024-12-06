package CrudDemo;
import java.util.Scanner;

/**
 *Author :Mekapothula.Reddy
 *Date   :7 Nov 2024
 *Time   :5:17:19 pm
 *Email  :Mekapothula.Reddy@coforge.com
 *
 */
public class EmployeeCRUDdemo{
	 
	public static void main(String[] args) throws Exception {
		Employee e=new Employee();
		String city=null,name=null,contact=null,email=null;
		int cid=0;;
 
		System.out.println("************** Coforge  **************");
		System.out.println("----------- Employee Management System ----------");
		while(true)
		{
			System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
			System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
			System.out.println("Press 5 for Update email \t Press 6 for Exit");
 
			Scanner s=new Scanner(System.in);
			int option=s.nextInt();
 
			switch(option)
			{
			case 1: System.out.println("Enter Employee Name: ");
			        name = s.next();
			        System.out.println("Enter City: ");
			        city = s.next();
			        System.out.println("Enter Contact No: ");
			        contact = s.next();
			        e.insertEmployee(name, city, contact);
			        break;
			
 
			case 2: e.getEmployee();
			        break;
 
			case 3: System.out.println("Enter Employee ID to Update: ");
                    cid= s.nextInt();
                    s.nextLine();
                    System.out.println("Enter New City: ");
                    city = s.nextLine();
                    e.updateEmployee(cid, city);
                    break;
 
			case 4: System.out.println("Enter Employee Id  to be Deleted:");
			        cid = s.nextInt();
			        e.deleteEmployee(cid);
			        break;
			
			case 5: System.out.println("Enter Employee Id,email for Email Updation:");
					cid= s.nextInt();	
					email = s.next();
					e.updateEmployeeEmail(cid, email);
					break;
			case 6: System.out.println("Program Terminated");
			        s.close();
			        System.exit(0);
 
			default: System.out.println("Invalid Selection");
			         break;
 
			}
		}
	}
}
			
			
			
			