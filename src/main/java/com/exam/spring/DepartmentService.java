package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentInterface di;
	
	public void adddepartment(Department d) {
		di.save(d);
	}
	
	public void deldepartment(Department d) {
		di.delete(d);
	}
	public void upddepartment(Department d) {
		di.save(d);
	}
	
	public List<Department> showalldeparntment(){
		return di.findAll();
	}
	
	public Department showbyid(int id) {
		return di.findById(id).get();
	}
	
	public Department showByName(String departmentname){
		return di.showByName(departmentname);
	}


}
