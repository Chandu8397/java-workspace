package CrudDemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :12:08:17 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

//Utility Class to connect MySql Server
public class ConnectionUtil {
	
	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","Chandu@8397");
		return con;
	}
	
	

}
