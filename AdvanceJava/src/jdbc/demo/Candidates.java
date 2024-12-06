package jdbc.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :3:33:29 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Candidates {
	
	Connection con=null;
	PreparedStatement pstmt; //Accept values at runtime 
	ResultSet rs;
	
	int cnt=0;
	String sqlUpdate;
	Scanner s;
	int eid;
	String lastName;
	
	public void getConnection() throws Exception{
		
		con= ConnectionUtil.createConnection();
		}
	
	public void UpdateConnection() throws Exception{
		
		sqlUpdate = "UPDATE candidates SET last_name = ? WHERE id= ?";
		pstmt = con.prepareStatement(sqlUpdate);
		
		// prepare data for update
				s=new Scanner(System.in);
				System.out.println("enter Employee id:");
				eid=s.nextInt();
				System.out.println("enter employee's new last name :");
				lastName=s.next();
						
				 // passing values to prepared statement using setter methods
				pstmt.setString(1, lastName);
				pstmt.setInt(2, eid);
				
				cnt=pstmt.executeUpdate();
				System.out.println(String.format("Row affected : %d", cnt));
				
				// reuse the prepared statement
		        lastName = "Clinton";
		        eid = 101;
		        pstmt.setString(1, lastName);
		        pstmt.setInt(2, eid);

		        cnt = pstmt.executeUpdate();
		        System.out.println(String.format("Row affected %d", cnt));
		        con.close();
				
	}
}
	

	
	
	
	
	
	
	
	
	
	
	

