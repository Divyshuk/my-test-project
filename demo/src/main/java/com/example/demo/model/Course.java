package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int id;
	@Column(name = "course_type")
	private String courseType;
	@Column(name = "course_description")
	private String courseDescription;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseType=" + courseType + ", courseDescription=" + courseDescription + "]";
	}
	public Course(int id, String courseType, String courseDescription) {
		super();
		this.id = id;
		this.courseType = courseType;
		this.courseDescription = courseDescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
}
