package com.home.studentmgmt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.studentmgmt.beans.StudentBean;
import com.home.studentmgmt.services.NotFoundException;
import com.home.studentmgmt.services.StudentServices;
import com.home.studentmgmt.services.StudentServicesImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	public StudentServices studentservices;
	public NotFoundException notfoundException;
	@PostMapping("")
	public StudentBean addStudent(@Valid @RequestBody StudentBean sb) {
		Boolean result = studentservices.addStudent(sb);
		System.out.println(result);
		return sb;
	}
	
	@GetMapping(path="/{param}")
	public StudentBean findStudent(@PathVariable("param") Long studentRollNo) {
		StudentBean sb = studentservices.findStudentByRno(studentRollNo);
		if (sb == null) throw new NotFoundException();
		System.out.println(sb);
		return sb;
	}

}
