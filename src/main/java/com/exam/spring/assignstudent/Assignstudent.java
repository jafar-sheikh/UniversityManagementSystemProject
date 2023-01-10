package com.exam.spring.assignstudent;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assignstudent {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	Integer assignstudentId;
	Integer id;
	String name;
	String semestername;
	String coursename;
	String departmentname;
	String isPresent="absent";
	
	
	
	
	public Assignstudent() {
		super();
	}




	public Assignstudent(Integer id, String name, String semestername, String coursename, String departmentname,
			String isPresent) {
		super();
		this.id = id;
		this.name = name;
		this.semestername = semestername;
		this.coursename = coursename;
		this.departmentname = departmentname;
		this.isPresent = isPresent;
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSemestername() {
		return semestername;
	}
	public void setSemestername(String semestername) {
		this.semestername = semestername;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getIsPresent() {
		return isPresent;
	}
	public void setIsPresent(String isPresent) {
		this.isPresent = isPresent;
	}
	@Override
	public String toString() {
		return "Assignstudent [id=" + id + ", name=" + name + ", semestername=" + semestername + ", coursename="
				+ coursename + ", departmentname=" + departmentname + ", isPresent=" + isPresent + "]";
	}
	
	
	
}
