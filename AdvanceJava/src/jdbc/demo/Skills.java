package jdbc.demo;
import java.sql.*;
/**
*Author :Mekapothula.Reddy
*Date   :7 Nov 2024
*Time   :4:44:09 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class Skills {
	

	Connection con;
	CallableStatement cstmt;//Accept values at runtime 
	ResultSet rs;
	
	int id;
	public Skills() throws Exception{
		con = ConnectionUtil.createConnection();
		}
	
	public void getSkills(int candidateId) throws Exception{
		
		//Calling StoredProcedure Using Single Parameter
		cstmt= con.prepareCall("{ call get_candidate_skill(?) }");
		cstmt.setInt(1, candidateId);
		rs= cstmt.executeQuery();
		
		if(rs.getRow()==0) {
			System.out.println("No Skills");
		}
		
		// Check if the ResultSet is empty
	    if (!rs.next()) {
	        System.out.println("No Skills");
	    } else {
	        // If there is data, process it
	        do {
	            System.out.println(String.format("%s - %s",
	                    rs.getString("first_name") + " "
	                    + rs.getString("last_name"),
	                    rs.getString("skill")));
	        } while (rs.next());
	    }
		/*while (rs.next()) {
            System.out.println(String.format("%s - %s",
                    rs.getString("first_name") + " "
                    + rs.getString("last_name"),
                    rs.getString("skill")));
				}
		
		con.close();
		
	}*/
	

}
	}
