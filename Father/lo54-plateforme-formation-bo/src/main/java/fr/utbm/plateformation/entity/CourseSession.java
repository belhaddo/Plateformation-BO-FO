package fr.utbm.plateformation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public
class CourseSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer csId;

    private Date csDatestart;

    private Date csDateend;

    private Integer csMax;

    @ManyToOne
    @JoinColumn(name="cou_code")
    private Course couCode;

    @ManyToOne
    @JoinColumn(name="loc_id")
    private Location locId;
}
