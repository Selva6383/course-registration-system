package com.example.Courseregistration.Controller;

import com.example.Courseregistration.Service.CourseService;
import com.example.Courseregistration.model.Course;
import com.example.Courseregistration.model.CourseRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:5501 ")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudent(){
        return courseService.enrolledStudent();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName) {
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulation!" + name + " Enrollment Sucessful for " + courseName;

    }
}
