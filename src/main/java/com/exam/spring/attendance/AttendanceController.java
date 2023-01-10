package com.exam.spring.attendance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.spring.assigncourse.Assigncourse;
import com.exam.spring.assigncourse.Assigncourseservice;
import com.exam.spring.assignstudent.Assignstudent;
import com.exam.spring.assignstudent.AssignstudentRepo;
import com.exam.spring.assignstudent.Assignstudentservice;
import com.exam.spring.courses.Course;
import com.exam.spring.courses.CourseService;


@Controller
public class AttendanceController {
	@Autowired
	Assigncourseservice as;
	@Autowired
	AssignstudentRepo ar;
	@Autowired
	Assignstudentservice ast;
	@Autowired
	CourseService cs;
	@Autowired
	AttendanceService ats;
	@Autowired
	AttendanceRepo aRepo;
	
	
	@RequestMapping("/attendance")
	public String attendance(Model m) {
		List<Course> co=cs.showallcourse();
		m.addAttribute("co",co);
		return "attendance";
	}
	
	@RequestMapping("/searchbycourcename")
	public String searchcource(@RequestParam String coursename , Model m) {
		List<Assignstudent> ast = ar.findbycourse(coursename);
		m.addAttribute("st", ast);
		return "attendancecreate";
		
	}
	
	@RequestMapping("/createattendance")
	public String createattendance(@ModelAttribute List<Attendance> attendanceList, Model m) {
		System.out.println(attendanceList);
		m.addAttribute(attendanceList);
		for (Attendance attendance : attendanceList) {
			System.out.println(attendance);
		}
		return "attendancecreate";
		
	}
	
	@RequestMapping("/saveattendance")
	public String saveattendance( Model m, @RequestParam("id") Integer id) {

		Assignstudent student = ar.findById(id).get();
		student.setIsPresent("Present");
		ar.save(student);
		Attendance attendance = new Attendance();
		attendance.setId(student.getId());
		attendance.setCoursename(student.getCoursename());
		attendance.setDepartmentname(student.getDepartmentname());
		attendance.setName(student.getName());
		attendance.setChecking(student.getIsPresent());
		attendance.setDate(new Date());
		attendance.setSemestername(student.getSemestername());
		ats.saveattendance(attendance);
		
		List<Assignstudent> studentList = ar.findbycourse(student.getCoursename());
		m.addAttribute("st",studentList);
		
		return "attendancecreate";
	}
	
	
	@RequestMapping("/showAttendance")
	public String showAttendance(Model model) {
		List<Attendance> attendance=aRepo.findAll();
		model.addAttribute("attendance" ,attendance );
		return "showattendance";
	}
	
	
	

}
