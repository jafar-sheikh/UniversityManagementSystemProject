package com.exam.spring.assignstudent;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface AssignstudentRepo extends JpaRepository<Assignstudent, Integer> {
	@Query("select u From Assignstudent u WHERE u.coursename =:n")
	public List<Assignstudent> findbycourse(@Param("n") String coursename);
	
//	@Query("SELECT u FROM Assignstudent u WHERE u.semestername =:n")
//	public List<Assignstudent> findBySemestername(@Param ("n") String semestername);
	
//	@Query("SELECT u FROM Assignstudent u WHERE u.departmentname =:n")
//	public List<Assignstudent> findByDepartmentname(@Param("n") String departmentname);
	
	
	@Query("SELECT u FROM Assignstudent u WHERE u.departmentname=?1 and u.semestername=?2")
	public List<Assignstudent> findByDeptNameAndSemesterName(String departmentname, String semestername);
	
	@Query("SELECT u FROM Assignstudent u WHERE u.semestername=?1 and u.coursename=?2")
	public List<Assignstudent> findBySemesterNameAndCoursename(String semestername, String coursename);
}
