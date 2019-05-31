package fr.utbm.plateformation.repository;

import fr.utbm.plateformation.entity.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationDao extends CrudRepository<Location,Integer> {
    Location findByLocId(int id);
    List<Location> findAll();
}
