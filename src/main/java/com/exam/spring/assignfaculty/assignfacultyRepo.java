package com.exam.spring.assignfaculty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface assignfacultyRepo extends JpaRepository<Assignfaculty, Integer> {

}
