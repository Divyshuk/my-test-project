package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Course;

public interface MyService {
	
	public List<Course> getCourse();

	public Course getCourseById(int id);

	public void addNewCourse(Course c);

	public void deleteCourse(int parseInt);

}
