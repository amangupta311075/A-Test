package com.example.ATest.controller;

import com.example.ATest.entity.Course;
import com.example.ATest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PatchMapping("/updatecourse")
    public List<Course> updateCourse()
    {
        return this.courseService.updateCourse();
    }

    @GetMapping("/getcoursebyid/{id}")
    public String getCourseId(@PathVariable int id) {return this.courseService.getCourseId(id);}

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course cr)
    {
        return this.courseService.addCourse(cr);
    }

}
