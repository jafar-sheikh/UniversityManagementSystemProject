package com.exam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring.assignstudent.Assignstudent;
import com.exam.spring.assignstudent.Assignstudentservice;
import com.exam.spring.student.Student;
import com.exam.spring.student.Studentservice;

@Controller
public class UniversityController {
	@Autowired
	private Universityservice us;
	
	@Autowired 
	private Studentservice ss;
	@Autowired
	 private Assignstudentservice as;
	
	//LOgin start
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@RequestMapping("/studentlogin")
	public String student() {
		return "studentdeshboard";
	}
	
	@RequestMapping("/facultylogin")
	public String faculty() {
		return "Facultydeshboard";
	}
	
	
	
	
	
	
	@RequestMapping("/adduniversity")
	public String university() {
		return "adduniversity";
	}
	
	@RequestMapping("/save")
	public String saveuniversity(@ModelAttribute University universtiy, Model m) {
		us.adduniversity(universtiy);
		
		String s= "Add university successfully";
		m.addAttribute("s",s);
		return "adduniversity";
	}
	
	
	
	//create Admit card
	
	
	@RequestMapping("/AdmitCard")
	public String admitcard() {
		return "createadmitcard";
	}
	
	@RequestMapping("/createAdmitCard")
	public String createadmitcard(@ModelAttribute Student student,@ModelAttribute Assignstudent ast, Model m) {
		student =ss.showbyid(student.getId());
		m.addAttribute("st" , student);
		ast = as.showbyid(ast.getId());
		m.addAttribute("ast", ast);
		
		 return "admitcard";
	}
	
	

}
