package com.home.studentmgmt.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.home.studentmgmt.beans.StudentBean;

@Repository
public class StudentRepositoryImpl {

	public Long StudentRollNo = 0L;
	public HashMap<Long, StudentBean> studentHM = new HashMap<Long, StudentBean>();

	public Boolean addStudent(StudentBean sb) {
		
		StudentRollNo = StudentRollNo + 1;
		sb.setStudentRollNo(StudentRollNo);
		System.out.println("StudentRollNo: " + StudentRollNo);
		studentHM.put(StudentRollNo, sb);
		return true;

	}

	public StudentBean findStudentByRno(Long studentRollNo) {

		return studentHM.get(studentRollNo);

	}

}
