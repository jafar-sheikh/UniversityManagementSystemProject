package com.exam.spring;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Department {
	@Id
	
	int departmentcode;
	String departmentname;
	String universityname;
	public Department() {
		super();
	}
	public Department(int departmentcode) {
		super();
		this.departmentcode = departmentcode;
	}
	public Department(String departmentname, String universityname) {
		super();
		this.departmentname = departmentname;
		this.universityname = universityname;
	}
	public Department(int departmentcode, String departmentname, String universityname) {
		super();
		this.departmentcode = departmentcode;
		this.departmentname = departmentname;
		this.universityname = universityname;
	}
	public int getDepartmentcode() {
		return departmentcode;
	}
	public void setDepartmentcode(int departmentcode) {
		this.departmentcode = departmentcode;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getUniversityname() {
		return universityname;
	}
	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}
	
	
	
	

}
