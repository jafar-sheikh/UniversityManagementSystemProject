package com.exam.spring.student;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	Integer id;
	String name;
	String father_name;
	String mother_name;
	String email;
	String phone;
	String address;
	Date birthdate;
	String blood_group;
	String photo;
	String gender;
	Integer semester_fee;
	String quta;
	Integer departmentcode;
	String departmentname;
	
	
	public Student() {
		super();
	}


	public Student(Integer id, String name, String father_name, String mother_name, String email, String phone,
			String address, Date birthdate, String blood_group, String photo, String gender, Integer semester_fee,
			String quta, Integer departmentcode, String departmentname) {
		super();
		this.id = id;
		this.name = name;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.birthdate = birthdate;
		this.blood_group = blood_group;
		this.photo = photo;
		this.gender = gender;
		this.semester_fee = semester_fee;
		this.quta = quta;
		this.departmentcode = departmentcode;
		this.departmentname = departmentname;
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


	public String getFather_name() {
		return father_name;
	}


	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}


	public String getMother_name() {
		return mother_name;
	}


	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
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


	public Date getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}


	public String getBlood_group() {
		return blood_group;
	}


	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Integer getSemester_fee() {
		return semester_fee;
	}


	public void setSemester_fee(Integer semester_fee) {
		this.semester_fee = semester_fee;
	}


	public String getQuta() {
		return quta;
	}


	public void setQuta(String quta) {
		this.quta = quta;
	}


	public Integer getDepartmentcode() {
		return departmentcode;
	}


	public void setDepartmentcode(Integer departmentcode) {
		this.departmentcode = departmentcode;
	}


	public String getDepartmentname() {
		return departmentname;
	}


	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	
	
	
	

	
	
	
	

}
