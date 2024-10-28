package com.example.myapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapi.model.Student;

@RestController
public class HomeController {
	@GetMapping("/teacher")
	public String TeacherName() {
		return "east or west Adarsh Bhai is best..";
		
	}
	@GetMapping("/data")
	public List<Student>data(){
		List l = new ArrayList();
//		l.add(new Student("adarsh",8));
//		return l;
		Student s = new Student(null, "adarsh",7);
		l.add(s);
		
		Student s1 = new Student(null, "ravi",17);
		l.add(s1);
		
		Student s2 = new Student(null, "yashaswi",27);
		l.add(s2);
		
		return l;
		
	}

}
