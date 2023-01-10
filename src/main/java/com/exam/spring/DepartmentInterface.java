package com.exam.spring;







import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface DepartmentInterface extends JpaRepository<Department, Integer> {
	

@Query("SELECT u FROM Department u WHERE u.departmentname = :name")
public Department showByName(@Param("name") String departmentname);

}
