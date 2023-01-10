package com.exam.spring.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseInterfaceRepo cr;
	
	public void addcourse(Course c) {
		cr.save(c);
	}
	
	public void deletecourse(Course c) {
		cr.delete(c);
	}
	public void updatecourse(Course c) {
		cr.save(c);
	}
	
	public List<Course>  showallcourse(){
		return cr.findAll();
	}
	
	public Course showById(int id) {
		return cr.findById(id).get();
	}

}
