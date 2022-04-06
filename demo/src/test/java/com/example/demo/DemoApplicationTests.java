package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.MyDao;
import com.example.demo.model.Course;
import com.example.demo.service.MyService;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	MyService myService;
	
	@MockBean
	MyDao myDao;
	
	@Test
	public void getCourseTest() {
		List<Course> value = new ArrayList<>();
		value.add(new Course(1, "abc", "this is abc course"));
		when(myDao.findAll()).thenReturn(value);	
		assertEquals(1,myService.getCourse().size());		
		
	}
	
	@Test
	public void getCourseByIdTest() {
		Course value =new Course(1, "abc", "this is abc course");
		int id =1;
		//when(myDao.findById(id).get()).thenReturn(value);	
		//assertEquals(1,myService.getCourseById(id).getId());
		//myDao.findById(id).get();
		//verify(myDao).findById(id).get();
		myDao.findById(id);
		verify(myDao, times(1)).findById(id);
		
	}
	
	@Test
	public void addNewCourseTest() {
		Course value =new Course(1, "abc", "this is abc course");
		//value.add(new Course(1, "abc", "this is abc course"));
		//when(myDao.save(value)).thenReturn(value);	
		//assertEquals(1,myService.addNewCourse(value));
		myService.addNewCourse(value);
		verify(myDao,times(1)).save(value);
		
	}
	
	@Test
	public void deleteUserTest() {
		Course value =new Course(1, "abc", "this is abc course");
		//value.add(new Course(1, "abc", "this is abc course"));
		//when(myDao.save(value)).thenReturn(value);	
		//assertEquals(1,myService.addNewCourse(value));
		int id = 1;
		//myService.deleteCourse(id);
		myDao.findById(id);
		myDao.delete(value);
		verify(myDao,times(1)).findById(id);
		verify(myDao,times(1)).delete(value);
		
		
	}

}
