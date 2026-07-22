package com.example.Courseregistration.Service;

import com.example.Courseregistration.model.Course;
import com.example.Courseregistration.model.CourseRegistry;
import com.example.Courseregistration.repository.CourseRegistryRepo;
import com.example.Courseregistration.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;


    public List<Course> availableCourses() {
       return  courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudent() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
