package com.example.jpa.mongodb.springboot.service;

import com.example.jpa.mongodb.springboot.model.User;

public interface IUserService {

	void insertUserInMongoAndJPADatabases (User user);
	
}
