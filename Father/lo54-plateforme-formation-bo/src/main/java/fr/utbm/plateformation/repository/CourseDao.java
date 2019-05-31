package fr.utbm.plateformation.repository;

import fr.utbm.plateformation.entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {
    Course findByCouCode(int code);
    List<Course> findAll();
}
