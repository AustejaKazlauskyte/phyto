package lt.phyto.phyto.models.dto;

import java.util.HashSet;

public class Property {
    private Long id;
    private String title;
    private HashSet<Herb> herbs;
    private HashSet<Property> properties;
    private boolean children;
    private boolean pregnant;
    private boolean highBloodPressure;

    public Property() {
    }

    public Property(Long id, String title, HashSet<Herb> herbs, HashSet<Property> properties,
                    boolean children, boolean pregnant, boolean highBloodPressure) {
        this.id = id;
        this.title = title;
        this.herbs = herbs;
        this.properties = properties;
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

    public HashSet<Herb> getHerbs() {
        return herbs;
    }

    public void setHerbs(HashSet<Herb> herbs) {
        this.herbs = herbs;
    }

    public HashSet<Property> getProperties() {
        return properties;
    }

    public void setProperties(HashSet<Property> properties) {
        this.properties = properties;
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
                ", properties=" + properties +
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
