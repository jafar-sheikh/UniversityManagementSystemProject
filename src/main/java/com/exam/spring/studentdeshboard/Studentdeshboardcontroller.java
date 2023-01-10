package com.exam.spring.studentdeshboard;

import java.awt.Window;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring.assignfaculty.Assignfaculty;
import com.exam.spring.assignfaculty.Assignfacultyservice;
import com.exam.spring.assignstudent.Assignstudent;
import com.exam.spring.assignstudent.Assignstudentservice;
import com.exam.spring.facultydeshboard.Facultyresult;
import com.exam.spring.facultydeshboard.FacultyresultRepo;
import com.exam.spring.facultydeshboard.FacultyresultService;

@Controller
public class Studentdeshboardcontroller {
	
	@Autowired
	private Assignfacultyservice as;
	@Autowired
	private FacultyresultService fs;
	@Autowired
	private FacultyresultRepo fr;
	@Autowired
	private Assignstudentservice ast;
	
	
	@RequestMapping("/showfacultyinfo")
	public String showfaculty(Model m) {
		List<Assignfaculty> f=as.showallassignfaculty();
		m.addAttribute("f" , f);
		return "showassignfaculty";
		
	}
	
	//show result 
	
	@RequestMapping("/searchresult")
	public String searchresult() {
		
		
		return "studentresultsearch";
	}
	
	
	@RequestMapping("/showresult")
	public String showresult(@ModelAttribute Facultyresult facultyresult ,@ModelAttribute Assignstudent ast1, Model m) {
		facultyresult = fr.findbyid(facultyresult.getId());
		m.addAttribute("fr" , facultyresult);
		ast1 = ast.showbyid(ast1.getId());
		m.addAttribute("ast", ast1);
		
		return "result";
		
	}
	
	@RequestMapping("/print")
	public void print() {
		
	}

}
