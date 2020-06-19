package lt.phyto.phyto.models.dto;

import java.util.Set;

public class Herb {

  private Long id;
  private String name;
  private Set<Property> properties;
  private Set<Condition> conditions;

    public Herb() {
    }

    public Herb(Long id, String name, Set<Property> properties, Set<Condition> conditions) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.conditions = conditions;
    }

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

    public Set<Property> getProperties() {
        return properties;
    }

    public void setProperties(Set<Property> properties) {
        this.properties = properties;
    }

    public Set<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(Set<Condition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "Herb{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", properties=" + properties +
                ", conditions=" + conditions +
                '}';
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
