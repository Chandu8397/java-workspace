package CrudDemo;
import java.sql.*;
import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :5:11:38pm
*Email  :Mekapothula.Reddy@coforge.com
**/

//Employee Class to implement CRUD operations
public class Employee {
	
	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;	
	int count;
	
	Scanner scan= new Scanner(System.in);
	
	public Connection getConnection()
	{
		 try {
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc", "root", "Chandu@8397");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        return con;
	}


	
	//Inserting
	public void insertEmployee(String name, String city, String contactno) throws SQLException
	{
		try {
            con = getConnection();
            String query = "INSERT INTO employee (name, city, contact) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setString(3, contactno);
            pstmt.executeUpdate();
            System.out.println("** Employee Inserted **");
        } catch (Exception e) {
            e.printStackTrace();
        }
		con.close();
	}
			
		
	//Display
	public void getEmployee() throws SQLException 
	{
		con = getConnection();	
		System.out.println("**************** Display Employee*****************");
		Statement stmt = con.createStatement();
		rs=stmt.executeQuery("Select * From employee");
		
		while(rs.next()) {
		 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
	 }
		con.close();
	 
	 
}
	
	//Update
	public void updateEmployee(int id,String city) throws Exception
	{
		try {
            con = getConnection();
            String query = "UPDATE employee SET city = ? WHERE eid = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, city);
            pstmt.setInt(2, id);
            count=pstmt.executeUpdate();
            System.out.println("** Employee Updated **");
        } catch (Exception e) {
            e.printStackTrace();
        }
		con.close();
	}
	
	
	//Delete
	public void deleteEmployee(int id) throws Exception
	{
		try {
            con = getConnection();
            String query = "DELETE FROM employee WHERE eid = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            count=pstmt.executeUpdate();
            System.out.println("** Employee Deleted **");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		con.close();

}


	//Updating Email
	public void updateEmployeeEmail(int id, String email) throws SQLException  {
		try {
			con = getConnection();
			String query = "UPDATE employee SET email=? WHERE eid = ?";
            pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
            pstmt.setInt(2, id);
            count=pstmt.executeUpdate();
            System.out.println("** Employee Updated **");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		con.close();
			
	}

}

