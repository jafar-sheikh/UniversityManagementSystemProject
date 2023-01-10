package com.exam.spring.adminpayment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminPayment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer paymentId;
	Integer id;
	String name;
	String semestername;
	String quta;
	int tutionfee;
	int specialfee;
	int facilitesfee;
	int libraryfee;
	int fechnologyfee;
	int regfee;
	int housingfee;
	int financialaid;
	int studentidfee;
	int total;
	public AdminPayment() {
		super();
	}
	public AdminPayment(Integer paymentId, Integer id, String name, String semestername, String quta, int tutionfee,
			int specialfee, int facilitesfee, int libraryfee, int fechnologyfee, int regfee, int housingfee,
			int financialaid, int studentidfee, int total) {
		super();
		this.paymentId = paymentId;
		this.id = id;
		this.name = name;
		this.semestername = semestername;
		this.quta = quta;
		this.tutionfee = tutionfee;
		this.specialfee = specialfee;
		this.facilitesfee = facilitesfee;
		this.libraryfee = libraryfee;
		this.fechnologyfee = fechnologyfee;
		this.regfee = regfee;
		this.housingfee = housingfee;
		this.financialaid = financialaid;
		this.studentidfee = studentidfee;
		this.total = total;
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
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
	public String getQuta() {
		return quta;
	}
	public void setQuta(String quta) {
		this.quta = quta;
	}
	public int getTutionfee() {
		return tutionfee;
	}
	public void setTutionfee(int tutionfee) {
		this.tutionfee = tutionfee;
	}
	public int getSpecialfee() {
		return specialfee;
	}
	public void setSpecialfee(int specialfee) {
		this.specialfee = specialfee;
	}
	public int getFacilitesfee() {
		return facilitesfee;
	}
	public void setFacilitesfee(int facilitesfee) {
		this.facilitesfee = facilitesfee;
	}
	public int getLibraryfee() {
		return libraryfee;
	}
	public void setLibraryfee(int libraryfee) {
		this.libraryfee = libraryfee;
	}
	public int getFechnologyfee() {
		return fechnologyfee;
	}
	public void setFechnologyfee(int fechnologyfee) {
		this.fechnologyfee = fechnologyfee;
	}
	public int getRegfee() {
		return regfee;
	}
	public void setRegfee(int regfee) {
		this.regfee = regfee;
	}
	public int getHousingfee() {
		return housingfee;
	}
	public void setHousingfee(int housingfee) {
		this.housingfee = housingfee;
	}
	public int getFinancialaid() {
		return financialaid;
	}
	public void setFinancialaid(int financialaid) {
		this.financialaid = financialaid;
	}
	public int getStudentidfee() {
		return studentidfee;
	}
	public void setStudentidfee(int studentidfee) {
		this.studentidfee = studentidfee;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	

}
