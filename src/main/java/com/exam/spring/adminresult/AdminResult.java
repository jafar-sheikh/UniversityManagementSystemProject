package com.exam.spring.adminresult;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer resultId;
	Integer id;
	String name;
	String semestername;
	int course1;
	int course2;
	int course3;
	int course4;
	int total;
	Double gpa;
	String gread;
	public AdminResult() {
		super();
	}
	public AdminResult(Integer resultId, Integer id, String name, String semestername, int course1, int course2,
			int course3, int course4, int total, Double gpa, String gread) {
		super();
		this.resultId = resultId;
		this.id = id;
		this.name = name;
		this.semestername = semestername;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.course4 = course4;
		this.total = total;
		this.gpa = gpa;
		this.gread = gread;
	}
	public Integer getResultId() {
		return resultId;
	}
	public void setResultId(Integer resultId) {
		this.resultId = resultId;
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
	public int getCourse1() {
		return course1;
	}
	public void setCourse1(int course1) {
		this.course1 = course1;
	}
	public int getCourse2() {
		return course2;
	}
	public void setCourse2(int course2) {
		this.course2 = course2;
	}
	public int getCourse3() {
		return course3;
	}
	public void setCourse3(int course3) {
		this.course3 = course3;
	}
	public int getCourse4() {
		return course4;
	}
	public void setCourse4(int course4) {
		this.course4 = course4;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	public String getGread() {
		return gread;
	}
	public void setGread(String gread) {
		this.gread = gread;
	}
	

}
