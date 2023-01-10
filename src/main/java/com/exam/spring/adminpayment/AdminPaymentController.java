package com.exam.spring.adminpayment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.spring.Department;
import com.exam.spring.DepartmentService;
import com.exam.spring.Semester.Semester;
import com.exam.spring.Semester.SemesterService;
import com.exam.spring.assignstudent.Assignstudent;
import com.exam.spring.assignstudent.AssignstudentRepo;
import com.exam.spring.assignstudent.Assignstudentservice;
import com.exam.spring.student.Student;
import com.exam.spring.student.Studentservice;
import com.exam.spring.studentpayment.StudentPayment;
import com.exam.spring.studentpayment.StudentPaymentService;

@Controller
public class AdminPaymentController {
	@Autowired
	private Assignstudentservice as;
	@Autowired
	private DepartmentService ds;
	@Autowired
	private SemesterService ss;
	@Autowired
	private AssignstudentRepo ar;
	@Autowired
	Studentservice sts;
	@Autowired
	AdminPaymentService aps;
	@Autowired
	StudentPaymentService sps;

	
	@RequestMapping("/adminpayment")
	public String adminpayment( Model m) {
		List<Department> de = ds.showalldeparntment();
		List<Semester> se =ss.showallsemester();
		m.addAttribute("se", se);
		m.addAttribute("de",de);
		
		return "adminpayment";
	}
	
	//show student payment
	
	@RequestMapping("/showstudentpayment")
	public String showstudentpayment(Model m) {
		List<StudentPayment> sp = sps.showallStudentpayment();
		m.addAttribute("sp", sp);
		return "showstudentpayment";
	}
	
	
	
	
	//search by department name and semestername
	@RequestMapping("/searchadminpayment")
	public String getAdminPayment(@RequestParam String departmentname, @RequestParam String semestername,  Model m) {
		List<Assignstudent> as =ar.findByDeptNameAndSemesterName(departmentname, semestername);
		m.addAttribute("as",as);
		return "showadminpayment";
		
	}
	
	@RequestMapping("/createadminpayment/{id}")
	public String createPayment(@PathVariable("id") Integer id , Model m) {
		Assignstudent astudent = as.showbyid(id);
		Student std=sts.showbyid(id); 
		
		if(std.getQuta().equals("Freedom_Fighter")) {
			int commesion_fee = std.getSemester_fee()*10/100;
			int net_payment = std.getSemester_fee()-commesion_fee;
			std.setSemester_fee(net_payment); 
		}else if(std.getQuta().equals("Ethnic_Group")) {
			int commesion_fee = std.getSemester_fee()*5/100;
			int net_payment = std.getSemester_fee()-commesion_fee;
			std.setSemester_fee(net_payment); 
		}else if(std.getQuta().equals("Disabled")) {
			int commesion_fee = std.getSemester_fee()*5/100;
			int net_payment = std.getSemester_fee()-commesion_fee;
			std.setSemester_fee(net_payment); 
		}else {
			int net_payment = std.getSemester_fee();
			std.setSemester_fee(net_payment); 
		}
		
		m.addAttribute("st", astudent);
		m.addAttribute("sts", std);
		
		return "adminpaymenttable";
	}
	
	
	@RequestMapping("/addadminpayment")
	public String AddAdminPayment(@ModelAttribute AdminPayment adminpayment , @RequestParam int tutionfee, @RequestParam int specialfee,@RequestParam int facilitesfee,
			@RequestParam int libraryfee,@RequestParam int fechnologyfee,@RequestParam int regfee,@RequestParam int housingfee,@RequestParam int financialaid,@RequestParam int studentidfee,@RequestParam String quta) {
		
		int tfee=tutionfee;
		int sfee=specialfee;
		int ffee=facilitesfee;
		int lfee=libraryfee;
		int fefee=fechnologyfee;
		int regefee=regfee;
		int hfee=housingfee;
		int fifee=financialaid;
		int sidfee=studentidfee;
		
		
		
		
		
		int total=tfee+sfee+ffee+lfee+ fefee+regefee+hfee+fifee+sidfee;
		adminpayment.setTotal(total);
		
		aps.addpayment(adminpayment);
		return "adminpaymenttable";
	}
	
	
	

}
