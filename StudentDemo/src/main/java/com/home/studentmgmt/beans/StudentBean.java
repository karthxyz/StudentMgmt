package com.home.studentmgmt.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class StudentBean {


	
	private Long studentRollNo;
	
	@NotBlank(message = "studentName may not be null")
	private String studentName;
	
	private Integer studentAge;
	
	@NotNull(message = "deptID may not be null")
	private Integer deptID;

}
