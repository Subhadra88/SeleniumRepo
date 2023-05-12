package org.Student;

import org.Department.Department;

public class Student extends Department{
	public void StudentName() {
		System.out.println("Student name is Subhadra");
	}
	public void studentDept() {
		System.out.println("Student Department is Computer sci");
	}
	public void StudentId() {
		System.out.println("Student Id is 7654");
	}
	
	public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentDept();
		stud.StudentId();
		stud.StudentName();
	
	}
}

