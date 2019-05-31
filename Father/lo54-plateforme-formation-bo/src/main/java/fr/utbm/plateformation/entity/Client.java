package fr.utbm.plateformation.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cliId;

    private String cliLastname;

    private String cliFirstname;

    private String cliAddr;

    private String cliPhone;

    private String cliEmail;

    private String cliMdp;

}
