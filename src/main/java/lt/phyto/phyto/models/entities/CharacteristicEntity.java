package lt.phyto.phyto.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "characteristic")
public class CharacteristicEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "title", length = 250, nullable = false)
  private String title;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "herb_characteristic",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "characteristic_id"))
  private Set<HerbEntity> herbs = new HashSet<>();

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "characteristic_medical_condition",
      joinColumns = @JoinColumn(name = "characteristic_id"),
      inverseJoinColumns = @JoinColumn(name = "medical_condition_id"))
  private Set<MedicalConditionEntity> conditions = new HashSet<>();

  @Column(name = "is_child", nullable = false)
  private boolean isChild;

  @Column(name = "is_pregnant", nullable = false)
  private boolean isPregnant;

  @Column(name = "has_high_blood_pressure", nullable = false)
  private boolean hasHighBloodPressure;
}
