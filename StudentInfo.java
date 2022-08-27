package studentdb;

public class StudentInfo {
	private int id;
	private String department;
	private String f_name;
	private String l_name;
	private int grdtYear;
	private int rank;
	public StudentInfo(int id, String department, String f_name, String l_name, int grdtYear, int rank) {
		super();
		this.id = id;
		this.department = department;
		this.f_name = f_name;
		this.l_name = l_name;
		this.grdtYear = grdtYear;
		this.rank = rank;
	}
	public StudentInfo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public int getGrdtYear() {
		return grdtYear;
	}
	public void setGrdtYear(int grdtYear) {
		this.grdtYear = grdtYear;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", department=" + department + ", f_name=" + f_name + ", l_name=" + l_name
				+ ", grdtYear=" + grdtYear + ", rank=" + rank + "]";
	}
	
	
	
}
