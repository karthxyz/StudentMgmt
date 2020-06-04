package com.home.studentmgmt.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class DepartmentBean {
	
	private Integer deptID;
	private String deptName;
	private String subjectOne;
	private String subjectTwo;
	

}
