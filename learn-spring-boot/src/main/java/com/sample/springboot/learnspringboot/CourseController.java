package com.sample.springboot.learnspringboot;


/*
localhost:8080/courses
{
    "id":1,
    "name":"",
    "author":""

}
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "AE"),
                new Course(2, "Learn DevOps", "AE")
        );
    }
}
