package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Universityservice {
	@Autowired
	private UniversityInterfaceRep ui;
	public void adduniversity(University u) {
		ui.save(u);
	}
	
	public List<University> sohwbyid(){
		return ui.findAll();
	}

}
