package lt.phyto.phyto.models.entities;
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
      name = "herb_characteristic",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "characteristic_id"))
  private Set<CharacteristicEntity> properties = new HashSet<>();

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "herb_medical_condition",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "medical_condition_id"))
  private Set<MedicalConditionEntity> conditions = new HashSet<>();


  public HerbEntity() {
  }

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

  public Set<CharacteristicEntity> getProperties() {
    return properties;
  }

  public void setProperties(Set<CharacteristicEntity> properties) {
    this.properties = properties;
  }

  public Set<MedicalConditionEntity> getConditions() {
    return conditions;
  }

  public void setConditions(Set<MedicalConditionEntity> conditions) {
    this.conditions = conditions;
  }
}
