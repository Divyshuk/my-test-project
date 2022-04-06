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
import com.example.demo.service.MyService;

@RestController
public class MyController {

	@Autowired
	MyService myservice;
	
	@GetMapping("/courses")
	public List<Course> getCourse() {	
		return myservice.getCourse();	
	}

	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable String id) {	
		return myservice.getCourseById(Integer.parseInt(id));	
	}
	
	@PostMapping("/courses")
	public void addCourse(@RequestBody Course c) {	
	 myservice.addNewCourse(c);		
	}
	
	@DeleteMapping("/courses/{id}")
	public void addCourse(@PathVariable String id) {	
	 myservice.deleteCourse(Integer.parseInt(id));		
	}
}
