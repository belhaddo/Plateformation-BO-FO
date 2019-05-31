package fr.utbm.plateformation.services;

import fr.utbm.plateformation.entity.Course;
import fr.utbm.plateformation.repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public Course findCourse(int code){
        return courseDao.findByCouCode(code);
    }

    public List<Course> findAllCourse(){
        return courseDao.findAll();
    }

}
