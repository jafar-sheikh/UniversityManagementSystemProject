package com.exam.spring.faculty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyinterfaceRepo extends JpaRepository<Faculty, Integer>{

}
