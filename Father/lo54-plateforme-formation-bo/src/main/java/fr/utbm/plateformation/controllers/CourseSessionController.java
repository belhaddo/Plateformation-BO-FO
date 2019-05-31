package fr.utbm.plateformation.controllers;

import fr.utbm.plateformation.entity.CourseSession;
import fr.utbm.plateformation.services.CourseSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/coursesSessions")
public class CourseSessionController {

    @Autowired
    CourseSessionService courseSessionService;

    @GetMapping(value="/all")
    public List<CourseSession> getAll(){ return courseSessionService.findAllCourseSession(); }
}
