package lt.phyto.phyto.models.dto;

import java.util.Set;

public class Condition {
    private Long id;
    private String title;
    private Set<Herb> herbSet;
    private Set<Property> propertySet;

    public Condition() {
    }

    public Condition(Long id, String title, Set<Herb> herbSet, Set<Property> propertySet) {
        this.id = id;
        this.title = title;
        this.herbSet = herbSet;
        this.propertySet = propertySet;
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
}
