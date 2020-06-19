package lt.phyto.phyto.models.entities;

import lt.phyto.phyto.models.dto.Condition;
import lt.phyto.phyto.models.dto.Herb;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "property")
public class PropertyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title", length = 250, nullable = false)
    private String title;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "property_herb",
    joinColumns = @JoinColumn(name = "property_id"),
    inverseJoinColumns = @JoinColumn(name = "herb_id"))
    private Set<Herb> herbs = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "property_condition",
            joinColumns = @JoinColumn(name = "property_id"),
            inverseJoinColumns = @JoinColumn(name = "condition_id"))
    private Set<Condition> conditions = new HashSet<>();


    private boolean children;
    private boolean pregnant;
    private boolean highBloodPressure;


}
