package com.exam.spring.attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {
	
	@Autowired
	private AttendanceRepo ar;
	
	
	public void saveattendance(Attendance a) {
		ar.save(a);
	}

}
