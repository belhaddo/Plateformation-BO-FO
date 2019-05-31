package fr.utbm.plateformation.repository;

import fr.utbm.plateformation.entity.Client;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ClientDao  extends CrudRepository<Client,Integer> {

    Client findByCliId(int id);
    List<Client> findAll();
    Client findByCliEmail(String email);

    @Modifying
    @Query(value = "insert into Client (cli_firstname, cli_lastname, cli_email,cli_addr,cli_phone, cli_mdp) VALUES (:fname, :lname, :email,:addr,:phone, :mdp)", nativeQuery = true)
    @Transactional
    void  addClient(@Param("fname")String fname,@Param("lname")String lname,@Param("email") String email,@Param("addr")String addr,@Param("phone")String phone ,@Param("mdp")String mdp);
}
