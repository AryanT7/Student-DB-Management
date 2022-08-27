package studentdb;

import java.sql.*;

public class StudentDao {
	public static boolean insertStudentToDB(StudentInfo st) {
		
		boolean f = false;
		try {
			Connection conn = DBConnection.createC();
			String query = "insert into engineeringstudents(Student_ID,Department,First_name,Last_name,PassOutYear,UniversityRank) values(?,?,?,?,?,?)";
			PreparedStatement prstm = conn.prepareStatement(query);
			//set the values of parameters
			prstm.setInt(1, st.getId());
			prstm.setString(2, st.getDepartment());
			prstm.setString(3, st.getF_name());
			prstm.setString(4, st.getL_name());
			prstm.setInt(5, st.getGrdtYear());
			prstm.setInt(6, st.getRank());
			
			//execute...
			prstm.executeUpdate();
			f= true;
			
		} catch (Exception e){
			e.printStackTrace();
		}
		return f;
		
	}
	
    public static boolean deleteStudentFromDB(int stid) {
		
		boolean f = false;
		try {
			Connection conn = DBConnection.createC();
			String query = "delete from engineeringstudents where Student_ID=?";
			PreparedStatement prstm = conn.prepareStatement(query);
			//set the values of parameters
			prstm.setInt(1, stid);
			
			//execute...
			prstm.executeUpdate();
			f= true;
			
		} catch (Exception e){
			e.printStackTrace();
		}
		return f;
		
	}
    
public static boolean updateStudentDB(StudentInfo st) {
		
		boolean f = false;
		try {
			Connection conn = DBConnection.createC();
			String query = "update engineeringstudents(Student_ID,Department,First_name,Last_name,PassOutYear,UniversityRank) set where (?,?,?,?,?,?)";
			PreparedStatement prstm = conn.prepareStatement(query);
			//set the values of parameters
			prstm.setInt(1, st.getId());
			prstm.setString(2, st.getDepartment());
			prstm.setString(3, st.getF_name());
			prstm.setString(4, st.getL_name());
			prstm.setInt(5, st.getGrdtYear());
			prstm.setInt(6, st.getRank());
			
			//execute...
			prstm.executeUpdate();
			f= true;
			
		} catch (Exception e){
			e.printStackTrace();
		}
		return f;
		
	}

    public static void showStudentDB() {
		
		try {
			Connection conn = DBConnection.createC();
			String query = "select * from engineeringstudents";
	    	Statement stmnt = conn.createStatement();	  
	    	ResultSet result = stmnt.executeQuery(query);
	    	
	    	while(result.next()) {
	    		int id = result.getInt(1);
	    		String department = result.getString(2);
	    		String f_name = result.getString(3);
	    		String l_name = result.getString(4);
	    		int grdtYear = result.getInt(5);
	    		int rank = result.getInt(6);
	    		
	    		System.out.println("ID : "+id);
	    		System.out.println("Departmant : "+department);
	    		System.out.println("First_name : "+f_name);
	    		System.out.println("Last_name : "+l_name);
	    		System.out.println("PassOutYear : "+grdtYear);
	    		System.out.println("UniversityRank : "+rank);
	    		System.out.println("***************************");
	    		
	    	}
			
		} catch (Exception e){
			e.printStackTrace();
		}

		
	}


}
