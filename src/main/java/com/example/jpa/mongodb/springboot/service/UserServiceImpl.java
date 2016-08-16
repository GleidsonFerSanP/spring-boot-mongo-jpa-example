package com.example.jpa.mongodb.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.mongodb.springboot.model.User;
import com.example.jpa.mongodb.springboot.repository.jpa.IUserJPARepository;
import com.example.jpa.mongodb.springboot.repository.mongo.IUserMONGORepository;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserMONGORepository iUserMONGORepository;

	@Autowired
	private IUserJPARepository iUserJPARepository;
	
	@Override
	public void insertUserInMongoAndJPADatabases(User user) {
		
		iUserMONGORepository.save(user);
		iUserJPARepository.save(user);
		
	}

}
