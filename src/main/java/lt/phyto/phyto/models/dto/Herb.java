package lt.phyto.phyto.models.dto;

import java.util.Set;

public class Herb {

    private Long id;
    private String name;
    private Set<Characteristic> properties;
    private Set<MedicalCondition> medicalConditions;

    public Herb() {
    }

    public Herb(Long id, String name, Set<Characteristic> properties, Set<MedicalCondition> medicalConditions) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.medicalConditions = medicalConditions;
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

    public Set<Characteristic> getProperties() {
        return properties;
    }

    public void setProperties(Set<Characteristic> properties) {
        this.properties = properties;
    }

    public Set<MedicalCondition> getMedicalConditions() {
        return medicalConditions;
    }

    public void setMedicalConditions(Set<MedicalCondition> medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    @Override
    public String toString() {
        return "Herb{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", properties=" + properties +
                ", conditions=" + medicalConditions +
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
