package lt.phyto.phyto.models.dto;

import java.util.Set;

public class Property {
    private Long id;
    private String title;
    private Set<Herb> herbSet;
    private Set<Property> propertySet;
    private boolean children;
    private boolean pregnant;
    private boolean highBloodPressure;

    public Property() {
    }

    public Property(Long id, String title, Set<Herb> herbSet, Set<Property> propertySet, boolean children,
                    boolean pregnant, boolean highBloodPressure) {
        this.id = id;
        this.title = title;
        this.herbSet = herbSet;
        this.propertySet = propertySet;
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

    public Set<Herb> getHerbSet() {
        return herbSet;
    }

    public void setHerbSet(Set<Herb> herbSet) {
        this.herbSet = herbSet;
    }

    public Set<Property> getPropertySet() {
        return propertySet;
    }

    public void setPropertySet(Set<Property> propertySet) {
        this.propertySet = propertySet;
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
}
