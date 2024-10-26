package com.educandoweb.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repostitory;
	
	public List<User> findAll() {
		List<User> list = repostitory.findAll();
		return list;
	}
	
	public User findById(Long Id) {
		Optional<User> obj = repostitory.findById(Id);
		return obj.get();
	}
}
