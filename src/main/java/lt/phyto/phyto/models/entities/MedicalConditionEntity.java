package lt.phyto.phyto.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "medical_condition")
public class MedicalConditionEntity extends AbstractEntity {

  @Column(name = "title", length = 250, nullable = false)
  private String title;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "herb_medical_condition",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "medical_condition_id"))
  private Set<HerbEntity> herbs;

  public MedicalConditionEntity() {}

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Set<HerbEntity> getHerbs() {
    return herbs;
  }

  public void setHerbs(Set<HerbEntity> herbs) {
    this.herbs = herbs;
  }
}
