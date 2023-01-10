package com.exam.spring.assigncourse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigncourseRepo extends JpaRepository<Assigncourse, Integer> {
	
}
