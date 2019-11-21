package com.jpademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpademo.domain.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
	
	
	@Query("SELECT o.testCase FROM UserEntity o WHERE o.ctlgId = :ctlgId and operNM=:opernm")
	public List<String> getTestCaseId(@Param("ctlgId") String ctlgId, @Param ("opernm")String opernm);

}
