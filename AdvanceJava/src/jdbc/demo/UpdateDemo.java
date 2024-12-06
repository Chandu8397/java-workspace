package jdbc.demo;

/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :3:52:32 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class UpdateDemo{
	
	public static void main(String[] args) {
		
		Candidates c1= new Candidates();
		try {
			c1.getConnection();
			c1.UpdateConnection();
		}
		catch(Exception e ) {
			System.out.println(e);
		}
	}
		
	}
