package lt.phyto.phyto.models.dto;

public class MedicalCondition {
  private Long id;
  private String title;

  public MedicalCondition() {}

  public MedicalCondition(Long id, String title) {
    this.id = id;
    this.title = title;
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
    return "MedicalCondition{" + "id=" + id + ", title='" + title + '\'' + '}';
  }
}
