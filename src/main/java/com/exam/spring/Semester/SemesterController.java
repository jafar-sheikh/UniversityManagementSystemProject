package com.exam.spring.Semester;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring.Department;
import com.exam.spring.DepartmentService;
import com.exam.spring.student.Student;

@Controller
public class SemesterController {
	
	@Autowired
	private SemesterService ss;
	@Autowired
	private DepartmentService ds;
	
	@RequestMapping("/Semester")
	public String semester() {
		return "Semester";
	}
	
	@RequestMapping("/addsemesterform")
	public String semesterform(Model m) {
		List<Department> d= ds.showalldeparntment();
		m.addAttribute("d" , d);
		return "addsemester";
	}
	
	@RequestMapping("/addsementer")
	public String addsementer(@ModelAttribute Semester semester) {
		ss.addsemester(semester);
		return "addsemester";
	}
	
	@RequestMapping("/showsemester")
	public String showsemester(Model m) {
		List<Semester> se= ss.showallsemester();
		m.addAttribute("se" ,se );
		
		return "showsemester";
	}
	
	@RequestMapping("/deletesemester/{semestercode}")
	public String deletesemester(@PathVariable int semestercode , Model m) {
		Semester s = ss.showbyid(semestercode);
		ss.deletesemester(s);
		m.addAttribute("se" , ss.showallsemester());
		return "showsemester";
	}
	
	@RequestMapping("/getvalueupdateform/{semestercode}")
	public String getvalueupdateform(@PathVariable  ("semestercode") int semestercode, Model m) {
		Semester s = ss.showbyid(semestercode);
		m.addAttribute("sm",s);
		
		return "semesterupdate";
		
	}
	
	@RequestMapping("/updatesemester")
	public String updatesemester(@ModelAttribute Semester semester, Model m) {
		
		ss.updatesemester(semester);
		m.addAttribute("se" , ss.showallsemester());
		return "showsemester";
	}
	
	
	@RequestMapping("/searchsemester")
	public String showById(@ModelAttribute Semester semester , Model m) {
		List<Semester> s = new ArrayList<>();
		Semester se = ss.showbyid(semester.getSemestercode());
		s.add(se);
		m.addAttribute("se", s);
		return "showsemester";
	}

}
