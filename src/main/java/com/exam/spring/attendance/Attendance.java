package com.exam.spring.attendance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Attendance {
	@Id
	@GeneratedValue
	Integer attendanceid;
	Integer id;
	String name;
	String checking;
	String semestername;
	String coursename;
	String departmentname;
	String facultyname;
	Date date;
	public Attendance() {
		super();
	}
	public Attendance(Integer attendanceid, Integer id, String name, String checking, String semestername,
			String coursename, String departmentname, String facultyname, Date date) {
		super();
		this.attendanceid = attendanceid;
		this.id = id;
		this.name = name;
		this.checking = checking;
		this.semestername = semestername;
		this.coursename = coursename;
		this.departmentname = departmentname;
		this.facultyname = facultyname;
		this.date = date;
	}
	public Integer getAttendanceid() {
		return attendanceid;
	}
	public void setAttendanceid(Integer attendanceid) {
		this.attendanceid = attendanceid;
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
	public String getChecking() {
		return checking;
	}
	public void setChecking(String checking) {
		this.checking = checking;
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
	public String getFacultyname() {
		return facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Attendance [attendanceid=" + attendanceid + ", id=" + id + ", name=" + name + ", checking=" + checking
				+ ", semestername=" + semestername + ", coursename=" + coursename + ", departmentname=" + departmentname
				+ ", facultyname=" + facultyname + ", date=" + date + "]";
	}
	
	
	
	

}
