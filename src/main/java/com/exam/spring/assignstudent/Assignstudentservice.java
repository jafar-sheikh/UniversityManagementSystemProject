package com.exam.spring.assignstudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Assignstudentservice {

	@Autowired
	AssignstudentRepo ar;
	
	public void assignstudent(Assignstudent a) {
		ar.save(a);
	}
	public void deleteassignstudent(Assignstudent a) {
		ar.delete(a);
	}
	public void updateassignstudent(Assignstudent a) {
		ar.save(a);
	}
	
	public List<Assignstudent> showallassignstudent(){
		return ar.findAll();
	}
	public Assignstudent showbyid(Integer id) {
		return ar.findById(id).get();
	}
}
