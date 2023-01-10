package com.exam.spring.studentpayment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.spring.Semester.Semester;
import com.exam.spring.Semester.SemesterService;
import com.exam.spring.adminpayment.AdminPayment;
import com.exam.spring.adminpayment.AdminPaymentRepo;
import com.exam.spring.adminpayment.AdminPaymentService;


@Controller
public class StudentPaymentController {
	@Autowired
	private SemesterService ss;
	@Autowired
	private AdminPaymentRepo ar;
	@Autowired
	private AdminPaymentService as;
	@Autowired
	private StudentPaymentService sps;
	
	@RequestMapping("/studentpayment")
	public String studentpayment(Model m) {
		List<Semester> st=ss.showallsemester();
		m.addAttribute("st",st);
		return "studentpayment";
		
	}
	
	@RequestMapping("/studentpaymentinfo")
	public String getStudentPayment(@RequestParam Integer id, @RequestParam String semestername, Model m) {
		AdminPayment ap =ar.findByIDAndSemesterName(id, semestername);
		//AdminPayment ap2 = as.findbyId(id);
		m.addAttribute("ap" ,ap);
		//m.addAttribute("ap2" , ap2);
		
		return "studentpaymenttable";
	}
	
	@RequestMapping("/savestudentpayment")
	public String savepayment(@ModelAttribute StudentPayment studentpayment) {
		sps.savepayment(studentpayment);
		return "studentpayment";
	}

}
