package jdbc.demo;
import java.sql.*;

/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :2:59:44 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class InsertDemo {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		int count;
		
		try {
			con = ConnectionUtil.createConnection();
			
			String str= "INSERT INTO skills(name) VALUES('Node JS')";
			
			stmt = con.createStatement();
			count= stmt.executeUpdate(str);
			
			if(count > 0) {
				System.out.println("Record Inserted Successfully");
			}
			
			String str1= "SELECT COUNT(id) FROM skills";
			rs= stmt.executeQuery(str1);
			int cnt = 0;
			while(rs.next()) {
				cnt=rs.getInt(1);
				}
			System.out.println("Total no.of records is: "+cnt);
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
