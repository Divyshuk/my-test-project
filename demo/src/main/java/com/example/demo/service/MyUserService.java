package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Course;
import com.example.demo.model.Users;

public interface MyUserService {

	public List<Users> getUsers();

	public Users getUserById(int parseInt);

	public void addNewUser(Users c);

	//public void deleteUser(int parseInt);

}
