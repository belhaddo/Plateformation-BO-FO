package fr.utbm.plateformation.controllers;

import fr.utbm.plateformation.entity.Course;
import fr.utbm.plateformation.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping(value="/all")
    public List<Course> getAll(){
        return courseService.findAllCourse();
    }
}
