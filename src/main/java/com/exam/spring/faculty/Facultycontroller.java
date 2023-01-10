package com.exam.spring.faculty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring.Department;
import com.exam.spring.DepartmentService;


@Controller
public class Facultycontroller {
	
	@Autowired
	private DepartmentService ds;
	@Autowired
	private Facultyservice fs;
	
	@RequestMapping("/faculty")
	public String faculty() {
		return "faculty";
	}
	
	@RequestMapping("/facultyform")
	public String facultyform(Model m) {
		List<Department> de =ds.showalldeparntment();
		m.addAttribute("de" , de);
		return "addfaculty";
	}
	
	@RequestMapping("/savefaculty")
	public String savefaculty(@ModelAttribute Faculty faculty) {
		fs.addfaculty(faculty);
		return "addfaculty";
	}
	
	@RequestMapping("/showfaculty")
	public String showfaculty(Model m) {
		List<Faculty> f = fs.showfaculty();
		m.addAttribute("fc" , f);
		return "showfaculty";
		
	}
		
	

}
