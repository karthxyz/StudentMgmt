package com.home.studentmgmt.repository;

import com.home.studentmgmt.beans.StudentBean;


public interface StudentRepository {

	public Boolean addStudent(StudentBean sb );
	public StudentBean findStudentByRno(Long studentRollNo);
	
}
