package lt.phyto.phyto.models.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {

  private static final int ODD_PRIME = 31;

  @Id
  @Column(name = "id", unique = true, nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    return getId() == null ? 0 : ODD_PRIME * getId().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (getId() == null || obj == null || !(getClass().equals(obj.getClass()))) {
      return false;
    }

    return getId().equals(((AbstractEntity) obj).getId());
  }
}
