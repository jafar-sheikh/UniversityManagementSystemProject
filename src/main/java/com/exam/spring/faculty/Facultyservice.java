package com.exam.spring.faculty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Facultyservice {
	
	@Autowired
	private FacultyinterfaceRepo fr;
	
	public void addfaculty(Faculty f) {
		fr.save(f);
	}
	public void deletefaculty(Faculty f) {
		fr.delete(f);
	}
	public void updatefaculty(Faculty f) {
		fr.save(f);
	}
	
	public List<Faculty> showfaculty(){
		return fr.findAll();
	}
	public Faculty showById(Integer id) {
		return fr.findById(id).get();
	}

}
