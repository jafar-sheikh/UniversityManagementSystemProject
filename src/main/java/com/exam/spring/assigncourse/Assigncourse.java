package com.exam.spring.assigncourse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assigncourse {
	
	@Id
	@GeneratedValue
	Integer id;
	String name;
	String semestername;
	String coursename;
	public Assigncourse() {
		super();
	}
	public Assigncourse(Integer id, String name, String semestername, String coursename) {
		super();
		this.id = id;
		this.name = name;
		this.semestername = semestername;
		this.coursename = coursename;
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
	
	

}
