package com.exam.spring.assignfaculty;

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
import com.exam.spring.faculty.Faculty;
import com.exam.spring.faculty.Facultyservice;

@Controller
public class Assignfacultycontroller {
	@Autowired
	private DepartmentService ds;
	@Autowired
	private Facultyservice fs;
	@Autowired
	private CourseService cs;
	@Autowired
	private SemesterService ss;
	@Autowired
	private Assignfacultyservice as;
	
	@RequestMapping("/addassignfaculty")
	public String addassignfaculty(Model m) {
		List<Department> d=ds.showalldeparntment();
		List<Faculty> f=fs.showfaculty();
		List<Course> c=cs.showallcourse();
		List<Semester> s=ss.showallsemester();
		m.addAttribute("ds" , d);
		m.addAttribute("fs" , f);
		m.addAttribute("cs" , c);
		m.addAttribute("ss" , s);
		return "assignfaculty";
	}
	
	@RequestMapping("/addassignfacultyinfo")
	public String addassignfacultyinfo(@ModelAttribute Assignfaculty af) {
		as.addassignfaculty(af);
		return "assignfaculty";
	}

}
