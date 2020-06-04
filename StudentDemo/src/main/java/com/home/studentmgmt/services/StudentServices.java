package com.home.studentmgmt.services;

import com.home.studentmgmt.beans.StudentBean;


public interface StudentServices {
	
	public Boolean addStudent(StudentBean addSB);
	public StudentBean findStudentByRno(Long studentRollNo);

}
