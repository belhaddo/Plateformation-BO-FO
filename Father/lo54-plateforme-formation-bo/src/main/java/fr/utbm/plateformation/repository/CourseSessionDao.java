package fr.utbm.plateformation.repository;

import fr.utbm.plateformation.entity.CourseSession;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseSessionDao extends CrudRepository<CourseSession,Integer> {
    CourseSession findByCsId(int id);
    List<CourseSession> findAll();
}
