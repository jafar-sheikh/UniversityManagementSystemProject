package com.exam.spring;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	int universitycode;
	String universityname;
	public University() {
		super();
	}
	public University(int universitycode) {
		super();
		this.universitycode = universitycode;
	}
	public University(int universitycode, String universityname) {
		super();
		this.universitycode = universitycode;
		this.universityname = universityname;
	}
	public int getUniversitycode() {
		return universitycode;
	}
	public void setUniversitycode(int universitycode) {
		this.universitycode = universitycode;
	}
	public String getUniversityname() {
		return universityname;
	}
	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}
	
	

}
