package com.nikhil.springboot.learnspringboot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Course {

	private long id;
	private String name;
	private String author;

}
