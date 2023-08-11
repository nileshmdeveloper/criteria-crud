package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.User;
import com.practice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getAll")
	public List<User> getAllUsers() {
		
		return userService.getAllUser();
	}
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		
		return userService.saveUser(user);
	}

}
