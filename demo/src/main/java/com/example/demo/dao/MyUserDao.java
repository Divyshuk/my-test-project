package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;
import com.example.demo.model.Users;

@Repository
public interface MyUserDao extends JpaRepository<Users, Integer>{
	
	//public void doExecute();
	//usecase to do get user by id who is having course as java.

	@Query(value ="select * from users u inner join course c on c.id=u.usercourseid where c.course_description='Java'", nativeQuery = true)
	public List<Users> getUsers();
//
//	public Users getUserById(int parseInt);
//
//	public void addNewUser(Users c);

	//public void deleteUser(int parseInt);

}
