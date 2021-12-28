package com.spring.springrest.services;

import java.util.List;

import com.spring.springrest.entities.Course;

public interface CourseService {

	
	public List<Course> getCourses();

	List<Course> getCourse();
	
	public Course getCourse(long CourseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);
}
