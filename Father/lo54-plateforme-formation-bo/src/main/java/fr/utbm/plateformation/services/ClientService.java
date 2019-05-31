package fr.utbm.plateformation.services;
import fr.utbm.plateformation.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import fr.utbm.plateformation.repository.ClientDao;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientDao clientDao ;
    private BCryptPasswordEncoder  passwordEncoder = new BCryptPasswordEncoder();

    public Client findClient(int id){
      return clientDao.findByCliId(id);
    }

    public List<Client> findAllClient(){
        return clientDao.findAll();
    }

    public Boolean connexion (String email, String mdp){
        Client client= clientDao.findByCliEmail(email);
        if(passwordEncoder.matches(mdp,client.getCliMdp())){
            return true;
        }
        return false;
    }

   public void addClient(String fname,String lname, String email,String addr,String phone ,String mdp){
        try {

            clientDao.addClient(fname, lname, email, addr, phone, passwordEncoder.encode(mdp));
        }catch(Exception ex){
            ex.printStackTrace();
        }
   }
}