//package com.example.demo.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.model.Users;
//
//
//@Repository
//public class MyUserDaoImpl implements MyUserDao{
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
////    public void setDataSource(DataSource dataSource) {
////        this.jdbcTemplate = new JdbcTemplate(dataSource);
////    }
////
////    public void doExecute() {
////       jdbcTemplate.execute("create table mytable1 (id integer, name varchar(100))");
////      // jdbcTemplate.execute("select * from course where id :  ");
////    }
//
//	@Override
//	public List<Users> getUsers() {
//		List<Users> userList = new ArrayList<>();
//		userList.addAll(jdbcTemplate.queryForList("select * from users",Users.class));
//		return userList;
//	}
//
//	@Override
//	public Users getUserById(int parseInt) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void addNewUser(Users c) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteUser(int parseInt) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void doExecute() {
//		// TODO Auto-generated method stub
//		
//	}
//}
