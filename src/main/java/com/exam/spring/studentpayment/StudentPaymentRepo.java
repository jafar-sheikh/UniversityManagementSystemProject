package com.exam.spring.studentpayment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentPaymentRepo extends JpaRepository<StudentPayment, Integer>{
	
	

}
