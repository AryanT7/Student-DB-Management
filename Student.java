package studentdb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to this student management app.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("press 1 to Add students");
			System.out.println("press 2 to Delete students");
			System.out.println("press 3 to Update students");
			System.out.println("press 4 to Display students");
			System.out.println("press 5 to Exit");
			
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			
			case 1:
				//Add student
			System.out.println("Enter student id");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter department");
			String department = br.readLine();
			System.out.println("Enter first name");
			String f_name = br.readLine();
		    System.out.println("Enter last name");
		    String l_name = br.readLine();
		    System.out.println("Enter pass out year");
			int grdtYear = Integer.parseInt(br.readLine());
			System.out.println("Enter university rank");
			int rank = Integer.parseInt(br.readLine());
		    
			//create StudentInfo object
			StudentInfo st = new StudentInfo(id,department, f_name, l_name, grdtYear, rank);
			boolean answer = StudentDao.insertStudentToDB(st);
			if(answer) {
				System.out.println("Successfully added.");
			}else {
				System.out.println("Something went wrong.");
			}
			System.out.println(st);
			
			case 2 : 
				//Delete student
				System.out.println("Enter Student ID to delete.");
				int stid = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudentFromDB(stid);		
				if(f) {
					System.out.println("Deleted successfully.");
				}else {
					System.out.println("Something went wrong.");
				}
			
			case 3:
				//Update student
				System.out.println("Enter student id");
				int id1 = Integer.parseInt(br.readLine());
				System.out.println("Enter department");
				String department1 = br.readLine();
				System.out.println("Enter first name");
				String f_name1 = br.readLine();
			    System.out.println("Enter last name");
			    String l_name1 = br.readLine();
			    System.out.println("Enter pass out year");
				int grdtYear1 = Integer.parseInt(br.readLine());
				System.out.println("Enter university rank");
				int rank1 = Integer.parseInt(br.readLine());
				StudentInfo st1 = new StudentInfo(id1,department1, f_name1, l_name1, grdtYear1, rank1);
				boolean answer1 = StudentDao.updateStudentDB(st1);
				if(answer1) {
					System.out.println("Successfully edited.");
				}else {
					System.out.println("Something went wrong.");
				}
				System.out.println(st1);
				
			case 4:
				//Show student data
				StudentDao.showStudentDB();
			
			case 5:
				break;
			
			default:
				System.out.println("Something went wrong.");
			}
		}

	}

}
