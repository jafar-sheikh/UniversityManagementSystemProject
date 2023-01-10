package com.exam.spring.adminpayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminPaymentService {

	
	@Autowired
	private AdminPaymentRepo apr;
	
	public void addpayment(AdminPayment adminpayment) {
		apr.save(adminpayment);
	}
	
	public AdminPayment findbyId(Integer id) {
		return apr.findById(id).get();
	}
}
