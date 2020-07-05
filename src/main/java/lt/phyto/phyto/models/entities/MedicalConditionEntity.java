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
import java.util.Set;

@Entity
@Table(name = "medical_condition")
public class MedicalConditionEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "title", length = 250, nullable = false)
  private String title;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "herb_medical_condition",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "medical_condition_id"))
  private Set<HerbEntity> herbs;


  public MedicalConditionEntity() {
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

  public Set<HerbEntity> getHerbs() {
    return herbs;
  }

  public void setHerbs(Set<HerbEntity> herbs) {
    this.herbs = herbs;
  }
}
