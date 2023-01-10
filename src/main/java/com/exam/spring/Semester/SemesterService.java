package com.exam.spring.Semester;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemesterService {
	
	@Autowired
	private SemesterInerfaceRepo sr;
	
	public void addsemester(Semester s) {
		sr.save(s);
	}
	public void deletesemester(Semester s) {
		sr.delete(s);
	}
	public void updatesemester(Semester s) {
		sr.save(s);
	}
	
	public List<Semester> showallsemester(){
		return sr.findAll();
	}
	
	public Semester showbyid(int id) {
		return sr.findById(id).get();
	}

}
