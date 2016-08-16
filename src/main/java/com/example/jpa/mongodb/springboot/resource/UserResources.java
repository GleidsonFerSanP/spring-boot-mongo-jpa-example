package com.example.jpa.mongodb.springboot.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.mongodb.springboot.model.User;
import com.example.jpa.mongodb.springboot.service.IUserService;

@RestController
@RequestMapping("users")
public class UserResources {
	
	@Autowired
	private IUserService iUserService;
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> inserir(@RequestBody User user){
		
		iUserService.insertUserInMongoAndJPADatabases(user);
		
		return ResponseEntity.ok("ok");
	}

}
