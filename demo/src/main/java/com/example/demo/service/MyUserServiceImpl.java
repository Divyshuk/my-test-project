package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MyUserDao;
import com.example.demo.model.Users;

@Service
public class MyUserServiceImpl implements MyUserService{
	@Autowired
	MyUserDao myUserDao;

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		
		return myUserDao.getUsers();
	}

	@Override
	public Users getUserById(int parseInt) {
		// TODO Auto-generated method stub
		return myUserDao.findById(parseInt).get();
	}

	@Override
	public void addNewUser(Users c) {
		// TODO Auto-generated method stub
		myUserDao.save(c);
	}

//	@Override
//	public void deleteUser(int parseInt) {
//		// TODO Auto-generated method stub
//		myUserDao.deleteUser(parseInt);
//	}


}
