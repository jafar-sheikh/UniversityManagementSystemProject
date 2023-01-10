package com.exam.spring.Semester;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterInerfaceRepo extends JpaRepository<Semester, Integer> {

}
