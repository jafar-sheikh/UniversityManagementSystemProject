package com.exam.spring.facultydeshboard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facultyresult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer result_id;
	Integer id;
	String name;
	String faculty;
	String sementername;
	String coursename;
	Double test1;
	Double test2;
	Double mid;
	Double finaltest;
	Double total;
	Double cgpa;
	String gread;
	public Facultyresult() {
		super();
	}
	public Facultyresult(Integer result_id, Integer id, String name, String faculty, String sementername,
			String coursename, Double test1, Double test2, Double mid, Double finaltest, Double total, Double cgpa,
			String gread) {
		super();
		this.result_id = result_id;
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.sementername = sementername;
		this.coursename = coursename;
		this.test1 = test1;
		this.test2 = test2;
		this.mid = mid;
		this.finaltest = finaltest;
		this.total = total;
		this.cgpa = cgpa;
		this.gread = gread;
	}
	public Integer getResult_id() {
		return result_id;
	}
	public void setResult_id(Integer result_id) {
		this.result_id = result_id;
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
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getSementername() {
		return sementername;
	}
	public void setSementername(String sementername) {
		this.sementername = sementername;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Double getTest1() {
		return test1;
	}
	public void setTest1(Double test1) {
		this.test1 = test1;
	}
	public Double getTest2() {
		return test2;
	}
	public void setTest2(Double test2) {
		this.test2 = test2;
	}
	public Double getMid() {
		return mid;
	}
	public void setMid(Double mid) {
		this.mid = mid;
	}
	public Double getFinaltest() {
		return finaltest;
	}
	public void setFinaltest(Double finaltest) {
		this.finaltest = finaltest;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	public String getGread() {
		return gread;
	}
	public void setGread(String gread) {
		this.gread = gread;
	}
	
	
	

}
