package com.nikhil.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","masternik"),
				new Course(2,"Learn Docker","masternik"),
				new Course(3,"Learn Azure","masternik"),
				new Course(4,"Learn GCP","masternik")
				);
	}
	
}
