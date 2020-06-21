package lt.phyto.phyto.models.dto;

import java.util.Set;

public class MedicalCondition {
  private Long id;
  private String title;
  private Set<Herb> herbs;
  private Set<Characteristic> properties;

  public MedicalCondition() {
  }

  public MedicalCondition(Long id, String title, Set<Herb> herbs, Set<Characteristic> properties) {
    this.id = id;
    this.title = title;
    this.herbs = herbs;
    this.properties = properties;
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

  public Set<Herb> getHerbs() {
    return herbs;
  }

  public void setHerbs(Set<Herb> herbs) {
    this.herbs = herbs;
  }

  public Set<Characteristic> getProperties() {
    return properties;
  }

  public void setProperties(Set<Characteristic> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    MedicalCondition medicalCondition = (MedicalCondition) o;

    return id.equals(medicalCondition.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override
  public String toString() {
    return "Condition{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", herbs=" + herbs +
            ", properties=" + properties +
            '}';
  }
}
