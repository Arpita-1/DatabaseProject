package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
        Statement stm = null;
        ResultSet result=null;
        
		try{
   	     
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	        
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin");
	        
	         stm = con.createStatement();
	         String query1 = ("Delete from eproduct where Id=3");
	         stm.executeUpdate(query1);
	         System.out.println("Record is Deleted in the table successfully!");
	         result = stm.executeQuery("select * from eproduct");
	        
	        while(result.next()) {
	            
	            System.out.println(result.getInt("ID") + " "+(result.getString("name"))+" "+(result.getBigDecimal("price"))+" "+(result.getDate("date_added")) );
	            //System.out.println(result.getString("name"));
	        }
	            
	        }
	    	catch(Exception e) {
	    		//if (con != null)
	                //con.close();
	    		System.out.println(e);
	    	}
	    		
		finally{
	    		 //close statements, statement and resultset here..
	    		}
	    }
	}
