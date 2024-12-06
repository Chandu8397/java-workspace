package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :10:50:16 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class SimpleJdbcApplication {

	public static void main(String[] args) {
		
		try {
			//Load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the Connection
			String url = "jdbc:mysql://localhost:3306/classicmodels";
			String username = "root";
			String password = "Chandu@8397";
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//Execute the Query
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM employees";
			ResultSet resultSet = statement.executeQuery(sql);
			
			System.out.println("Employee Number\t firstName\t jobTitle");
			//Process the Result Set
			while (resultSet.next()) {
				int employeeNumber = resultSet.getInt("employeeNumber");
				String firstName = resultSet.getString("firstName");
				System.out.println(employeeNumber+"\t\t\t"+firstName+"\t\t\t"+resultSet.getString(8));
			}
			
			//Close the resources
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
	}
		}

}
