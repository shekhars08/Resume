import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SignUpDb {
	
	public  void database(String fname,String username,String email,String phonenum,String password) throws ClassNotFoundException {
	      try {
	    	  
	         // Step 1: Allocate a database 'Connection' object
	         Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/resume", "root", "1820");
		        //example passwor
	               // MySQL: "jdbc:mysql://hostname:port/databaseName", "username", "password"
	 
	         // Step 2: Allocate a 'Statement' object in the Connection
	         Statement stmt = conn.createStatement();
	         long phonenumber=Long.parseLong(phonenum);
	         String insert = "INSERT INTO signup(fullname, username, email, phone, password) values('"+fname+"','"+username+"','"+email+"','"+phonenumber+"','"+password+"')";
	         int count=stmt.executeUpdate(insert);
	         System.out.println(count);
	      }
	      
	      catch (SQLException e){
	    	  e.printStackTrace();
	      }
	}
}
