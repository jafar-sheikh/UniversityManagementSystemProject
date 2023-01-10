package com.exam.spring.facultydeshboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyresultService {
	
	@Autowired
	private FacultyresultRepo fr;
	
	public void addfacultyresult(Facultyresult f) {
		fr.save(f);
	}
	
	public Facultyresult showById(Integer id) {
		return fr.findById(id).get();
		
	}
	
	public List<Facultyresult> showall(){
		return fr.findAll();
		
	}

}
