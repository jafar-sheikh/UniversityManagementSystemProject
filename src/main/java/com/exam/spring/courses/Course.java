package com.exam.spring.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	int coursecode;
	String coursename;
	String semestername;
	public Course() {
		super();
	}
	public Course(int coursecode, String coursename, String semestername) {
		super();
		this.coursecode = coursecode;
		this.coursename = coursename;
		this.semestername = semestername;
	}
	public int getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(int coursecode) {
		this.coursecode = coursecode;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getSemestername() {
		return semestername;
	}
	public void setSemestername(String semestername) {
		this.semestername = semestername;
	}
	
	

}
