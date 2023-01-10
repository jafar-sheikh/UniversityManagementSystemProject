package com.exam.spring.faculty;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
@Id
Integer id;
String name;
String email;
String phone;
String address;
String designation;
String departmentname;
Date bod;
String bloodgroup;
String gender;
public Faculty() {
	super();
}
public Faculty(Integer id, String name, String email, String phone, String address, String designation,
		String departmentname, Date bod, String bloodgroup, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.address = address;
	this.designation = designation;
	this.departmentname = departmentname;
	this.bod = bod;
	this.bloodgroup = bloodgroup;
	this.gender = gender;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
public Date getBod() {
	return bod;
}
public void setBod(Date bod) {
	this.bod = bod;
}
public String getBloodgroup() {
	return bloodgroup;
}
public void setBloodgroup(String bloodgroup) {
	this.bloodgroup = bloodgroup;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
	


}
