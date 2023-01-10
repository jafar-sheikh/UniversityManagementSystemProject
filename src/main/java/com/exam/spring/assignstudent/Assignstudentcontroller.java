package com.exam.spring.assignstudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring.Department;
import com.exam.spring.DepartmentService;
import com.exam.spring.Semester.Semester;
import com.exam.spring.Semester.SemesterService;
import com.exam.spring.courses.Course;
import com.exam.spring.courses.CourseService;
import com.exam.spring.student.Studentservice;

@Controller
public class Assignstudentcontroller {
	
	@Autowired
	Assignstudentservice as;
	@Autowired
	SemesterService ss;
	@Autowired
	Studentservice sts;
	@Autowired
	CourseService cs;
	@Autowired
	DepartmentService ds;
	
	@RequestMapping("/showassignstudent")
	public String showassign(Model m) {
		List<Department> de = ds.showalldeparntment();
		List<Semester> se = ss.showallsemester();
		List<Course> co = cs.showallcourse();
		m.addAttribute("de" , de);
		m.addAttribute("se" , se);
		m.addAttribute("co" , co);
		return "assignstudent";
	}
	
	@RequestMapping("/addassignstudent")
	public String addassign(@ModelAttribute Assignstudent assignstudent) {
		as.assignstudent(assignstudent);
		return "assignstudent";
	}

}
