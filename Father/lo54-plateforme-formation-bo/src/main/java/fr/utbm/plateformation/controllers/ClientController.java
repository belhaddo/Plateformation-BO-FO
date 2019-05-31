package fr.utbm.plateformation.controllers;

import fr.utbm.plateformation.entity.Client;
import fr.utbm.plateformation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

@GetMapping(value="/all")
    public List<Client> getAll(){ return clientService.findAllClient(); }

@PostMapping( value="/connection")
    public Boolean clientConnected(@RequestBody Client cli){return true;}

@RequestMapping(value="/connexion", method = RequestMethod.GET)
    public Boolean connecxion(@RequestParam(value = "email", required = false)String email,
                              @RequestParam(value = "mdp", required = false)String mdp) {
    return clientService.connexion(email, mdp); }

//@GetMapping(value="/add")
//public void add(@RequestParam(value = "mdp", required = false)String mdp){ clientService.addClient(mdp); }
}

