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
public class Course {

    @Id
    private Integer couCode;

    private String couTitle;

    @OneToMany(mappedBy = "couCode", cascade = CascadeType.ALL)
    private List<CourseSession> CourseSessions =new ArrayList<CourseSession>();

}
