package com.example.ATest.service;

import com.example.ATest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{


    List<Course> l1;

    public CourseServiceImpl() {

        l1=new ArrayList<>();
        l1.add(new Course(145,"this a spring boot course","Aspringboot" ));
        l1.add(new Course(34,"this is my first spring boot crud practice code","become a dev"));
    }

    @Override
    public List<Course> getCourses() {
        return l1;
    }

    @Override
    public List<Course> updateCourse() {
        return null;
    }

    @Override
    public String getCourseId(int id)
    {
        if(id==l1.get(0).getId())
        {
            return l1.get(0).getDescription();
        }
        else
        {
            return null;
        }

    }
    @Override
    public Course addCourse(Course course)
    {
        l1.add(course);
        return null;
    }
}
