package com.exam.spring.assignfaculty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Assignfacultyservice {
	
	@Autowired
	private assignfacultyRepo ar;
	
	
	public void addassignfaculty(Assignfaculty a) {
		ar.save(a);
	}
	
	public void updateassignfaculty(Assignfaculty a) {
		ar.save(a);
	}
	public void deleteassignfaculty(Assignfaculty a) {
		ar.delete(a);
	}
	
	public List<Assignfaculty> showallassignfaculty(){
		return ar.findAll();
	}

}
