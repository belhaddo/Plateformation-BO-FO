package fr.utbm.plateformation.services;

import fr.utbm.plateformation.entity.CourseSession;
import fr.utbm.plateformation.repository.CourseSessionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseSessionService {

    @Autowired
    CourseSessionDao courseSessionDao;

    public CourseSession findByIdCourseSession(int id){
        return courseSessionDao.findByCsId(id);
    }

    public List<CourseSession> findAllCourseSession(){
        return courseSessionDao.findAll();
    }
}
