package org.college;

public class College {                         //childclass
	private void collegeName() {
System.out.println("mamcollege");
	}
	private void collegeCode() {
		// TODO Auto-generated method stub
System.out.println("810");
	}
	private void collegeRank() {
		// TODO Auto-generated method stub
System.out.println("02");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.studentName();
		st.studentDept();
		st.studentId();
		
		
		Dept dt = new Dept();
		dt.deptName();
		
		Hostel ht = new Hostel();
		ht.hostelName();
		
		
		College cl = new College();
		cl.collegeName();
		cl.collegeCode();
		cl.collegeRank();
		
		
	}
	
	
}
