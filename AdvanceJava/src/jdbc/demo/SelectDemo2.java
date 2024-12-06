package jdbc.demo;
import java.sql.*;


/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :12:12:16 pm
*Email  :Mekapothula.Reddy@coforge.com
*/
//Demonstarate Projection

public class SelectDemo2 {
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
	try {
		con = ConnectionUtil.createConnection();
		stmt = con.createStatement();
		rs= stmt.executeQuery("SELECT first_name, last_name, email from candidates order by last_name");
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+rs.getString("email"));
			}
		con.close();
		}
	catch(Exception ex) {
		System.out.println(ex);
	}
	}
}
