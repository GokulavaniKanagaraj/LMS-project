package com.aspire.LmsProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aspire.LmsProject.model.UserEntity;
import com.aspire.LmsProject.repository.UserRepository;
import com.aspire.LmsProject.service.UserService;

@RestController

public class UserController {
	private UserService userService;

  
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/save")
   public UserEntity save(@RequestBody UserEntity user) {
		return userService.save(user);
    }
	
     @GetMapping("/get/{employee_id}")
	 public UserEntity getUserById(@PathVariable String employee_id) {
		 return userService.getUserById(employee_id);
	 }
     @GetMapping("/getall")
     public List<UserEntity> findAll(){
    	 return userService.getUser();
     }
     @PutMapping("/update")
    public UserEntity updateUserEntity(UserEntity userEntity) {
    	return userService.save(userEntity);
    }
     @DeleteMapping("/delete/{employee_id}")
     public String deleteUserEntity(@PathVariable String employee_id) {
    	 return userService.deleteUserEntity(employee_id);
     }
	 
	 
	
}
