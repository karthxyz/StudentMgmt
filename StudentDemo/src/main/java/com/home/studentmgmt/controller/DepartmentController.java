package com.home.studentmgmt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.studentmgmt.beans.DepartmentBean;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@PostMapping("")
	public DepartmentBean addDept(@RequestBody DepartmentBean db) {
		return db;
	}

}
