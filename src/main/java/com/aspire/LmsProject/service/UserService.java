package com.aspire.LmsProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.LmsProject.model.UserEntity;
import com.aspire.LmsProject.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;


@Autowired
public UserService(UserRepository userRepository) {
	this.userRepository=userRepository;
}

	public UserEntity save(UserEntity user) {
		return userRepository.save(user) ;
	}

   public List<UserEntity> getUser(){
	   return userRepository.findAll();
   }
   
   public UserEntity getUserById(String employee_id){
	   return userRepository.findById(employee_id).orElse(null);
   }
   
   public String deleteUserEntity(String employee_id) {
	   userRepository.deleteById(employee_id);
	   return "Succefully deleted" +employee_id;
   }




	/*
	 * public UserEntity updateUserEntity(UserEntity userEntity) { UserEntity
	 * userentity=userRepository.findById(userEntity.getId()).orElse(userEntity );
	 * userentity.setEmployee_Name(userEntity.getEmployee_name()); return
	 * userRepository.save(userentity); }
	 */

}
