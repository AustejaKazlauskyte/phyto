package lt.phyto.phyto.models.dto;

import lt.phyto.phyto.converters.YesNoBooleanConverter;

import javax.persistence.Convert;
import java.util.Set;

public class Property {
    private Long id;
    private String title;
    private Set<Herb> herbs;
    private Set<Condition> conditions;

    @Convert(converter = YesNoBooleanConverter.class)
    private boolean children;


    private boolean pregnant;
    private boolean highBloodPressure;

    public Property() {
    }

    public Property(Long id, String title, Set<Herb> herbs, Set<Condition> conditions, boolean children, boolean pregnant, boolean highBloodPressure) {
        this.id = id;
        this.title = title;
        this.herbs = herbs;
        this.conditions = conditions;
        this.children = children;
        this.pregnant = pregnant;
        this.highBloodPressure = highBloodPressure;
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

    public Set<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(Set<Condition> conditions) {
        this.conditions = conditions;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    public boolean isHighBloodPressure() {
        return highBloodPressure;
    }

    public void setHighBloodPressure(boolean highBloodPressure) {
        this.highBloodPressure = highBloodPressure;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", herbs=" + herbs +
                ", conditions=" + conditions +
                ", children=" + children +
                ", pregnant=" + pregnant +
                ", highBloodPressure=" + highBloodPressure +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Property property = (Property) o;

        return id.equals(property.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
