package lt.phyto.phyto.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "herb")
public class HerbEntity extends AbstractEntity {

  @Column(name = "name", length = 250, nullable = false)
  private String name;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "herb_characteristic",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "characteristic_id"))
  private Set<CharacteristicEntity> characteristics = new HashSet<>();

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "herb_medical_condition",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "medical_condition_id"))
  private Set<MedicalConditionEntity> medicalConditions = new HashSet<>();

  public HerbEntity() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<CharacteristicEntity> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(Set<CharacteristicEntity> characteristics) {
    this.characteristics = characteristics;
  }

  public Set<MedicalConditionEntity> getMedicalConditions() {
    return medicalConditions;
  }

  public void setMedicalConditions(Set<MedicalConditionEntity> medicalConditions) {
    this.medicalConditions = medicalConditions;
  }
}
