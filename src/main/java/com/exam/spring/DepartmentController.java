package com.exam.spring;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService ds;
	@Autowired
	private Universityservice us;
	
	@RequestMapping("/department")
	public String department() {
		return "department";
	}
	
	@RequestMapping("/adddepartmentform")
	public String departmentform( Model m) {
		List<University> u= us.sohwbyid();
		m.addAttribute("ue", u);
		return "adddepartment";
	}
	
	@RequestMapping("/showdepartmentform")
	public String showdepartment( Model m) {
		List<Department> dp= ds.showalldeparntment();
		m.addAttribute("de", dp);
		return "showdepartment";
	}
	
	@RequestMapping(value="/adddepartment", method=RequestMethod.POST)
	public String adddepartment(@ModelAttribute Department department) {
		
		
		ds.adddepartment(department);
		
		
		return "adddepartment";
	}
	
	
	@RequestMapping("/updatepage/{departmentcode}")
	public String goupdatedepartment(@PathVariable ("departmentcode") int departmentcode, Model m) {
		
		Department d = ds.showbyid(departmentcode);
		m.addAttribute("d", d);
		return "updatedepartment";
	}
	
	@RequestMapping("/updatedepartment")
	public String updatedepartment(@ModelAttribute Department department , Model m) {
		ds.upddepartment(department);
		m.addAttribute("de" , ds.showalldeparntment());
		return "showdepartment";
	}
	
	@RequestMapping("/deletedepartment/{departmentcode}")
	public String deletedepartment(@PathVariable int departmentcode , Model m ) {
		Department d = ds.showbyid(departmentcode);
		ds.deldepartment(d);
		m.addAttribute("de" , ds.showalldeparntment());
		return "showdepartment";
	}
	
	@RequestMapping("/search")
	public String searchdepartment(@RequestParam ("departmentname") String departmentname, Model m) {
		
		Department dt = ds.showByName(departmentname);
		m.addAttribute("de", dt);
		return "showdepartment";
	}
	
//	@RequestMapping("/all/id/")
//	public String m1(@ModelAttribute Department department  ,Model m) {
//		List<Department> de =new ArrayList<>();
//		Department d=ds.showbyid(department.getDepartmentcode());
//		de.add(d);
//		m.addAttribute("de", de);
//		return "showdepartment";
//	}
	
	@RequestMapping("/all/id/")
	public String departmentbyname(@ModelAttribute Department department , Model m) {
		List<Department> de =new ArrayList<>();
		Department d= ds.showByName(department.getDepartmentname());
		de.add(d);
		m.addAttribute("de", de);
		return "showdepartment";
	}
	



	

}
