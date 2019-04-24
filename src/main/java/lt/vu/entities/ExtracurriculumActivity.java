package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="NAUJA_KLASE")
@Getter
@Setter
public class ExtracurriculumActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;
}
