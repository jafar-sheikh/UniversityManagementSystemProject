package com.exam.spring.facultydeshboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.spring.Semester.Semester;
import com.exam.spring.Semester.SemesterService;
import com.exam.spring.assignstudent.Assignstudent;
import com.exam.spring.assignstudent.AssignstudentRepo;
import com.exam.spring.assignstudent.Assignstudentservice;
import com.exam.spring.courses.Course;
import com.exam.spring.courses.CourseService;
import com.exam.spring.faculty.Faculty;
import com.exam.spring.faculty.Facultyservice;

@Controller
public class Facultydeshboardcontroller {
	
	@Autowired
	Assignstudentservice as;
	@Autowired
	Facultyservice fs;
	@Autowired
	FacultyresultService frs;
	@Autowired
	private SemesterService ss;
	@Autowired
	private CourseService cs;
	@Autowired
	private AssignstudentRepo ar;
	
	
	
	@RequestMapping("/resultsearch")
	public String resultsearch(Model m) {
		List<Semester> se=ss.showallsemester();
		List<Course> co = cs.showallcourse();
		m.addAttribute("se",se);
		m.addAttribute("co",co);
		return "facultyresultsearch";
	}
	
	
	
	@RequestMapping("/resultinfo")
	public String resultinfo(@RequestParam String semestername, String coursename,  Model m) {
		List<Assignstudent> st=ar.findBySemesterNameAndCoursename(semestername, coursename);
		
		m.addAttribute("st",st);
		
		return "facultyresult";
	}
	
	@RequestMapping("/resultinfo/{id}")
	public String resultinfoid(@PathVariable ("id") Integer id , Model m) {
		Assignstudent a =as.showbyid(id);
		m.addAttribute("a" , a);
		return "facultyresultinfo";
	}
	
	
	@RequestMapping("/addresult")
	public String setresult(@ModelAttribute Facultyresult facultyresult, @RequestParam Double test1, 
			@RequestParam Double test2, @RequestParam Double mid, @RequestParam Double finaltest) {
		Double testp1= (test1*.1);
		Double testp2=(test2*.1);
		Double midp = (mid*.3);
		Double finaltestp =(finaltest*.5);
		Double cgpa=0.0;
		String gread="";
		
		Double total =testp1+testp2+midp+finaltestp;
		if(total >80.0 && total <=100.0) {
			cgpa=4.0;
			gread="A+";
		}else if(total <80.0 && total >=70.0) {
			cgpa =3.5;
			gread="A";
		}else if(total <70.0 && total >=60.0) {
			cgpa=3.0;
			gread="B";
		}
		else if(total <60.0 && total >=50.0) {
			cgpa=2.5;
			gread="C";
		}else if(total <50.0 && total >=40.0) {
			cgpa=2.0;
			gread="D";
		}else {
			cgpa=0.0;
			gread="Fail";
		}
		facultyresult.setGread(gread);
		facultyresult.setCgpa(cgpa);
		facultyresult.setTotal(total);
		frs.addfacultyresult(facultyresult);
		return "facultyresultinfo";
	}
	
	

}
