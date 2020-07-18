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
@Table(name = "characteristic")
public class CharacteristicEntity extends AbstractEntity {

  @Column(name = "title", length = 250, nullable = false)
  private String title;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "herb_characteristic",
      joinColumns = @JoinColumn(name = "herb_id"),
      inverseJoinColumns = @JoinColumn(name = "characteristic_id"))
  private Set<HerbEntity> herbs = new HashSet<>();

  @Column(name = "is_child", nullable = false)
  private boolean isChild;

  @Column(name = "is_pregnant", nullable = false)
  private boolean isPregnant;

  @Column(name = "has_high_blood_pressure", nullable = false)
  private boolean hasHighBloodPressure;

  public CharacteristicEntity() {
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
}
