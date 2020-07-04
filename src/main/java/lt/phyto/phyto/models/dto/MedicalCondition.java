package lt.phyto.phyto.models.dto;

import java.util.Set;

public class MedicalCondition {
  private Long id;
  private String title;
  private Set<Characteristic> characteristics;

  public MedicalCondition() {
  }

  public MedicalCondition(Long id, String title, Set<Characteristic> characteristics) {
    this.id = id;
    this.title = title;
    this.characteristics = characteristics;
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

  public Set<Characteristic> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(Set<Characteristic> characteristics) {
    this.characteristics = characteristics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    MedicalCondition that = (MedicalCondition) o;

    return id.equals(that.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override
  public String toString() {
    return "MedicalCondition{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", characteristics=" + characteristics +
            '}';
  }
}
