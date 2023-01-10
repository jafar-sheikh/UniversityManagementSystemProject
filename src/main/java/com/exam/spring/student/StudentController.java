package com.exam.spring.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.exam.spring.Department;
import com.exam.spring.DepartmentService;

@Controller
public class StudentController {
	
	@Autowired
	private Studentservice ss;
	@Autowired
	private StudentInterfaceRep sr;
	
	@Autowired
	private DepartmentService ds;
	
	
	//public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/imagedata";
	
	@RequestMapping("/studentform")
	public String studentform() {
		return "student";
	}
	
	@RequestMapping("/addstudentform")
	public String addstudentform(Model m) {
		List<Department> d =ds.showalldeparntment();
		m.addAttribute("de" , d);
		return "addstudent";
	}
	
	
	@RequestMapping("/addstudent")
	public String addstudent(@ModelAttribute Student student) {
		ss.addstudent(student);
		return "addstudent";
	}
	
	@RequestMapping("/showstudent")
	public String showstudent(Model m) {
		List<Student> st= ss.showallstudent();
		m.addAttribute("st",st);
		return "showstudent";
	}
	
	
	//update start
	
	@RequestMapping("/studentformgetvalue/{id}")
	public String datagetupdateform(@PathVariable ("id") int id, Model m) {
		Student s= ss.showbyid(id);
		m.addAttribute("s" , s);
		return "studentupdate";
	}
	
	@RequestMapping("/studentupdate")
	public String studentupdate(@ModelAttribute Student student , Model m) {
		
		ss.updatestudent(student);
		m.addAttribute("st" , ss.showallstudent());
		return "showstudent";
	}
	//update end
	
	//delete
	
	@RequestMapping("/deletestudent/{id}")
	public String deletestudent(@PathVariable("id") int id , Model m) {
		Student s= ss.showbyid(id);
		ss.deletestudent(s);
		m.addAttribute("st" , ss.showallstudent());
		
		return "showstudent";
	}
	
	//search by id
	@RequestMapping("/searchstudent")
	public String showById(@ModelAttribute Student student , Model m) {
		List<Student> st = new ArrayList<>();
		Student s= ss.showbyid(student.getId());
		st.add(s);
		m.addAttribute("st", st);
		return "showstudent";
	}
		
	//search by name
	
//	@RequestMapping("/searchstudent")
//	public String showByName(@RequestParam String name, Model m) {
//		m.addAttribute("st", sr.findByName(name));
//		return "showstudent";
//	}
	
	

}
