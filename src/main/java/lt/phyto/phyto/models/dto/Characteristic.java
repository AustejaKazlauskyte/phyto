package lt.phyto.phyto.models.dto;

import java.util.Set;

public class Characteristic {
  private Long id;
  private String title;
  private Set<MedicalCondition> medicalConditions;
  private boolean isChild;
  private boolean isPregnant;
  private boolean hasHighBloodPressure;

  public Characteristic() {
  }

  public Characteristic(Long id, String title, Set<MedicalCondition> medicalConditions, boolean isChild, boolean isPregnant, boolean hasHighBloodPressure) {
    this.id = id;
    this.title = title;
    this.medicalConditions = medicalConditions;
    this.isChild = isChild;
    this.isPregnant = isPregnant;
    this.hasHighBloodPressure = hasHighBloodPressure;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Set<MedicalCondition> getMedicalConditions() {
    return medicalConditions;
  }

  public void setMedicalConditions(Set<MedicalCondition> medicalConditions) {
    this.medicalConditions = medicalConditions;
  }

  public boolean isChild() {
    return isChild;
  }

  public void setChild(boolean child) {
    isChild = child;
  }

  public boolean isPregnant() {
    return isPregnant;
  }

  public void setPregnant(boolean pregnant) {
    isPregnant = pregnant;
  }

  public boolean isHasHighBloodPressure() {
    return hasHighBloodPressure;
  }

  public void setHasHighBloodPressure(boolean hasHighBloodPressure) {
    this.hasHighBloodPressure = hasHighBloodPressure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Characteristic that = (Characteristic) o;

    return id.equals(that.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override
  public String toString() {
    return "Characteristic{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", medicalConditions=" + medicalConditions +
            ", isChild=" + isChild +
            ", isPregnant=" + isPregnant +
            ", hasHighBloodPressure=" + hasHighBloodPressure +
            '}';
  }
}
