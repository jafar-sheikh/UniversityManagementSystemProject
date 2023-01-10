package com.exam.spring.Semester;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Semester {
	
	@Id
	int semestercode;
	String semestername;
	String departmentname;
	public Semester() {
		super();
	}
	public Semester(int semestercode, String semestername, String departmentname) {
		super();
		this.semestercode = semestercode;
		this.semestername = semestername;
		this.departmentname = departmentname;
	}
	public int getSemestercode() {
		return semestercode;
	}
	public void setSemestercode(int semestercode) {
		this.semestercode = semestercode;
	}
	public String getSemestername() {
		return semestername;
	}
	public void setSemestername(String semestername) {
		this.semestername = semestername;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	
	

}
