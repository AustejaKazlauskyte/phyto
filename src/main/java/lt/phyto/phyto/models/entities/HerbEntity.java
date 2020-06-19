package lt.phyto.phyto.models.entities;

import lt.phyto.phyto.models.dto.Condition;
import lt.phyto.phyto.models.dto.Property;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "herb")
public class HerbEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "name", length = 250, nullable = false)
  private String name;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "herb_property",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "property_id"))
  private Set<Property> properties = new HashSet<>();

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
          name = "herb_condition",
          joinColumns = @JoinColumn(name = "herb_id"),
          inverseJoinColumns = @JoinColumn(name = "condition_id"))
  private Set<Condition> conditions = new HashSet<>();


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Property> getProperties() {
    return properties;
  }

  public void setProperties(Set<Property> properties) {
    this.properties = properties;
  }

  public Set<Condition> getConditions() {
    return conditions;
  }

  public void setConditions(Set<Condition> conditions) {
    this.conditions = conditions;
  }
}
