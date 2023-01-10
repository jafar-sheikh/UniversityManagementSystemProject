package com.exam.spring.studentpayment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentPayment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer s_paymentId;
	Integer id;
	String name;
	String semestername;
	String p_method;
	String phone;
	int t_id;
	int total;
	public StudentPayment() {
		super();
	}
	public StudentPayment(Integer s_paymentId, Integer id, String name, String semestername, String p_method,
			String phone, int t_id, int total) {
		super();
		this.s_paymentId = s_paymentId;
		this.id = id;
		this.name = name;
		this.semestername = semestername;
		this.p_method = p_method;
		this.phone = phone;
		this.t_id = t_id;
		this.total = total;
	}
	public Integer getS_paymentId() {
		return s_paymentId;
	}
	public void setS_paymentId(Integer s_paymentId) {
		this.s_paymentId = s_paymentId;
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
	public String getP_method() {
		return p_method;
	}
	public void setP_method(String p_method) {
		this.p_method = p_method;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
