package fr.utbm.plateformation.controllers;

import fr.utbm.plateformation.entity.Location;
import fr.utbm.plateformation.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/locations")
public class LocationController {


    @Autowired
    LocationService locationService;

    @GetMapping(value="/all")
    public List<Location> getAll(){
        return locationService.findAllLocation();
    }
}
