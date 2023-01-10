package com.exam.spring.assigncourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Assigncourseservice {
	@Autowired
	private AssigncourseRepo ar;
	
	public void addassigncourse(Assigncourse a) {
		ar.save(a);
	}
	public void deleteassigncourse(Assigncourse a) {
		ar.delete(a);
	}
	public void updateassigncourse(Assigncourse a) {
		ar.save(a);
	}
	
	public List<Assigncourse> showassigncourse(){
		return ar.findAll();
	}
	public Assigncourse showassignById(Integer id) {
		return ar.findById(id).get();
	}

}
