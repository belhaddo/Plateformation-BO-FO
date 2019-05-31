package fr.utbm.plateformation.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer locId;

    private String locCity;


    @OneToMany(mappedBy = "locId", cascade = CascadeType.ALL)
    private List<CourseSession> CourseSessions =new ArrayList<CourseSession>();

}
