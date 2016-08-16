package com.example.jpa.mongodb.springboot.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.mongodb.springboot.model.User;

@org.springframework.stereotype.Repository
public interface IUserJPARepository extends JpaRepository<User, Long> {

}
