package com.example.ATest.service;

import java.util.List;
import com.example.ATest.entity.Course;

public  interface CourseService {

        public List<Course> getCourses();
        public List<Course> updateCourse();

    }


