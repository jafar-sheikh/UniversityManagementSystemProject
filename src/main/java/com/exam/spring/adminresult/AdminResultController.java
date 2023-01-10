package com.exam.spring.adminresult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.spring.facultydeshboard.Facultyresult;
import com.exam.spring.facultydeshboard.FacultyresultService;

@Controller
public class AdminResultController {
	
	@Autowired
	private FacultyresultService fs;
	
	
	@RequestMapping("/showResult")
	public String showResult(Model model) {
		List<Facultyresult> facultyresult = fs.showall();
		model.addAttribute("facultyresult" , facultyresult);
		return "showresult";
	}

}
