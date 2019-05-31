package fr.utbm.plateformation.services;

import fr.utbm.plateformation.entity.Location;
import fr.utbm.plateformation.repository.LocationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {


    @Autowired
    LocationDao locationDao;

    public Location findLocation(int id){
        return locationDao.findByLocId(id);
    }

    public List<Location> findAllLocation(){
        return locationDao.findAll();
    }
}
