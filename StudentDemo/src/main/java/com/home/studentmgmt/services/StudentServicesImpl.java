package com.home.studentmgmt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.studentmgmt.beans.StudentBean;
import com.home.studentmgmt.repository.StudentRepositoryImpl;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
	public StudentRepositoryImpl studentrepository;

	public Boolean addStudent(StudentBean addSB) {

        Boolean isSuccess = studentrepository.addStudent(addSB);
		return isSuccess;

	}

	public StudentBean findStudentByRno(Long studentRollNo) {
    return studentrepository.findStudentByRno(studentRollNo);

	}

}
