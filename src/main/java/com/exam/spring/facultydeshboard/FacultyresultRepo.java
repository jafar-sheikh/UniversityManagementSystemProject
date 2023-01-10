package com.exam.spring.facultydeshboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exam.spring.assignstudent.Assignstudent;

@Repository
public interface FacultyresultRepo extends JpaRepository<Facultyresult, Integer> {
	@Query("select u From Facultyresult u WHERE u.id =:n")
	public Facultyresult findbyid(@Param("n") Integer id);

}
