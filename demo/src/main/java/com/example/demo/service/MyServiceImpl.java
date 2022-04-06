package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MyDao;
import com.example.demo.dao.MyUserDao;
import com.example.demo.model.Course;

@Service
public class MyServiceImpl implements MyService{
	@Autowired
	MyDao mydao;
	
	public List<Course> getCourse() {
		return mydao.findAll();
	}
	
	@Override
	public Course getCourseById(int id) {
		return mydao.findById(id).get();
	}
	@Override
	public void addNewCourse(Course c) {
		mydao.save(c);
		
	}
	@Override
	public void deleteCourse(int deleteCourse) {
		Course c = mydao.findById(deleteCourse).get();
		mydao.delete(c);
		
	}

}
