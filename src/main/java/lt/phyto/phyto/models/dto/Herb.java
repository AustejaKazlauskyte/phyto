package lt.phyto.phyto.models.dto;

import java.util.Set;

public class Herb {

  private Long id;
  private String name;
  private Set<Characteristic> characteristics;
  private Set<MedicalCondition> medicalConditions;

  public Herb() {}

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

  public Set<Characteristic> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(Set<Characteristic> characteristics) {
    this.characteristics = characteristics;
  }

  public Set<MedicalCondition> getMedicalConditions() {
    return medicalConditions;
  }

  public void setMedicalConditions(Set<MedicalCondition> medicalConditions) {
    this.medicalConditions = medicalConditions;
  }

  @Override
  public String toString() {
    return "Herb{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", characteristics="
        + characteristics
        + ", medicalConditions="
        + medicalConditions
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Herb herb = (Herb) o;

    return id.equals(herb.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }
}
