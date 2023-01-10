package com.exam.spring.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring.Semester.Semester;
import com.exam.spring.Semester.SemesterService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService cs;
	
	@Autowired
	private SemesterService ss;
	
	@RequestMapping("/course")
	public String course() {
		return "course";
	}
	
	@RequestMapping("/addcourse")
	public String addcourse(Model m) {
		List<Semester> s=ss.showallsemester();
		m.addAttribute("co" , s);
		return "addcourse";
		
	}
	
	@RequestMapping("/addcourseinfo")
	public String addcourseinfo(@ModelAttribute Course course) {
		cs.addcourse(course);
		return "addcourse";
	}
	
	@RequestMapping("/showcourse")
	public String showcourser( Model m) {
		List<Course> c= cs.showallcourse();
		m.addAttribute("co", c);
		return "showcourse";
		
	}
	
	

}
