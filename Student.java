package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	
	public void studentName() {
		
	System.out.println("Student name");

	}
	
	public void studentDept() {
		
	System.out.println("Student Department");
		
	}
	
	public void studentId() {
		
	System.out.println("Student ID");
	}

	public static void main(String[] args) {
		
		College colobj = new College();
		colobj.collegeName();
		colobj.collegeCode();
		colobj.collegeRank();
		
		Department deptobj = new Department();
		deptobj.deptName();
		
		Student stdobj = new Student();
		stdobj.studentName();
		stdobj.studentDept();
		stdobj.studentId();
		

	}

}
