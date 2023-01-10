package com.exam.spring.studentpayment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentPaymentService {
	
	@Autowired
	private StudentPaymentRepo spr;
	
	public void savepayment(StudentPayment sp) {
		spr.save(sp);
	}
	
	public List<StudentPayment> showallStudentpayment(){
		return spr.findAll();
	}

}
