package com.practice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dao.UserDao;
import com.practice.model.User;
import com.practice.repo.UserRepo;

@Service 
public class UserService {;
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	UserRepo userRepo;
	
	public List<User> getAllUser() {
		
		return userDao.getUsers();		
	}
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}

}
