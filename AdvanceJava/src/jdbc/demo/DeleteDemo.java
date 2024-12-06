package jdbc.demo;
import java.sql.*;

/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :4:17:33 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class DeleteDemo {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt; //Accept values at runtime 
		int cnt= 0;
		
		try {
			con = ConnectionUtil.createConnection();
			
			String sql="DELETE from candidates where rtrim(last_name)" + "Like\'k%g'; ";
			
			String sql1= "DELETE from candidates where id=101;";
			
			stmt = con.createStatement();
			cnt = stmt.executeUpdate(sql);
			cnt = stmt.executeUpdate(sql1);

			
			if(cnt> 0) {
				System.out.println(cnt+"Records Deleted");
			}
			else {
				System.out.println("Recoed Not Found");
			}
			con.close();
				}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
