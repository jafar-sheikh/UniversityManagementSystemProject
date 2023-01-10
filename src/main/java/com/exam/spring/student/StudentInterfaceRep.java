package com.exam.spring.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentInterfaceRep extends JpaRepository<Student, Integer>{
	@Query("select u From Student u WHERE u.name =:n")
	public List<Student> findByName(@Param("n") String name);
}
