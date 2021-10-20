package com.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CourseDao;
import com.springrest.entities.Course;

@Service
public class CourseServiceImp implements CourseService{
	
	@Autowired
	public CourseDao courseDao;
	public List<Course> getCourses(){
		
		return courseDao.findAll();
		
	}

	@Override
	public Course getCourse(long courseId) {
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
	
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
	
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	
	}

}
