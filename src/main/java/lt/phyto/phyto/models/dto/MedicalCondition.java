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
  public String toString() {
    return "MedicalCondition{" + "id=" + id + ", title='" + title + '\'' + '}';
  }
}
