package studentdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	static Connection conn;
	
	public static Connection createC() {
	    
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	final String DB_URL = "jdbc:mysql://localhost:3306/University";
		    final String USER = "root";
		    final String PASS = "1234";
		    
		    conn = DriverManager.getConnection(DB_URL, USER,PASS);
	    }
	     catch (Exception e) {
			e.printStackTrace();
		}
	   
	    return conn;	
	    	
	}
}
