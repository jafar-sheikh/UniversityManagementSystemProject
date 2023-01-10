package com.exam.spring.adminpayment;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminPaymentRepo extends JpaRepository<AdminPayment, Integer> {
	@Query("SELECT u FROM AdminPayment u WHERE u.id=?1 and u.semestername=?2")
	public AdminPayment findByIDAndSemesterName(Integer id, String semestername);

}
