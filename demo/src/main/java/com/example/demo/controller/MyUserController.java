package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.model.Users;
import com.example.demo.service.MyService;
import com.example.demo.service.MyUserService;

@RestController
public class MyUserController {

	@Autowired
	MyUserService myUserService;
	
	@GetMapping("/user")
	public List<Users> getUsers() {	
		return myUserService.getUsers();	
	}

	@GetMapping("/user/{id}")
	public Users getuser(@PathVariable String id) {	
		return myUserService.getUserById(Integer.parseInt(id));	
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody Users c) {	
		myUserService.addNewUser(c);		
	}
	
//	@DeleteMapping("/user/{id}")
//	public void addUser(@PathVariable String id) {	
//		myUserService.deleteUser(Integer.parseInt(id));		
//	}
}
