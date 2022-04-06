package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class Users {
	@Id
	@Column(name="userid")
	private int userId;
	@Column(name="username")
	private String userName;
	@Column(name="userprofile")
	private String userProfile;
	@Column(name="usercourseid")
	private int userCourseId;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userProfile=" + userProfile + ", userCourseId="
				+ userCourseId + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	public int getUserCourseId() {
		return userCourseId;
	}
	public void setUserCourseId(int userCourseId) {
		this.userCourseId = userCourseId;
	}
	public Users(int userId, String userName, String userProfile, int userCourseId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userProfile = userProfile;
		this.userCourseId = userCourseId;
	}

	
}
