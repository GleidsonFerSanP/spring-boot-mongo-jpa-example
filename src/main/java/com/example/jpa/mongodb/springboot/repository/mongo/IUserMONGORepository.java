package com.example.jpa.mongodb.springboot.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.jpa.mongodb.springboot.model.User;

@org.springframework.stereotype.Repository
public interface IUserMONGORepository extends MongoRepository<User, Long>{

}
