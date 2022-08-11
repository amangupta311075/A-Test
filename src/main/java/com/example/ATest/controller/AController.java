package com.example.ATest.controller;

import com.example.ATest.entity.Course;
import com.example.ATest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class AController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home()
    {
        return "Welcome to crud";
    }
    //courses
    @GetMapping("/courses")
    public List<Course> getCourse()
    {
        return this.courseService.getCourses();
    }
}
