package com.aspire.LmsProject.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspire.LmsProject.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {
	

	
	

}
