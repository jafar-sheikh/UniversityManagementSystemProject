package com.exam.spring.assigncourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring.Semester.Semester;
import com.exam.spring.Semester.SemesterService;
import com.exam.spring.courses.Course;
import com.exam.spring.courses.CourseService;
import com.exam.spring.student.Student;
import com.exam.spring.student.Studentservice;

@Controller
public class Assigncoursecontroller {
	@Autowired
	private Studentservice ss;
	@Autowired
	private SemesterService se;
	@Autowired
	private CourseService cs;
	@Autowired
	private Assigncourseservice as;
	
	
	@RequestMapping("/assigncourse")
	public String assigncourse() {
		return "Assigncourse";
	}
	
	@RequestMapping("/addassigncourse")
	public String addassigncourse(Model m) {
		List<Student> s =ss.showallstudent();
		List<Semester> sem = se.showallsemester();
		List<Course> co = cs.showallcourse();
		m.addAttribute("st" ,s);
		m.addAttribute("se", sem);
		m.addAttribute("co",co);
		
		return "addassigncourse";
		
	}
	
	@RequestMapping("/assingcourseadd")
	public String assingcourseadd(@ModelAttribute Assigncourse ass) {
		as.addassigncourse(ass);
		return "addassigncourse";
	}

}
