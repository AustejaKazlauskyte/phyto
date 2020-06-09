package lt.phyto.phyto.models.dto;

import java.util.Set;

public class Herb {

    private Long id;
    private String name;
    private Set<Property> propertySet;
    private Set<Condition> conditionSet;

    public Herb() {
    }

    public Herb(Long id, String name, Set<Property> propertySet, Set<Condition> conditionSet) {
        this.id = id;
        this.name = name;
        this.propertySet = propertySet;
        this.conditionSet = conditionSet;
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

    public Set<Property> getPropertySet() {
        return propertySet;
    }

    public void setPropertySet(Set<Property> propertySet) {
        this.propertySet = propertySet;
    }

    public Set<Condition> getConditionSet() {
        return conditionSet;
    }

    public void setConditionSet(Set<Condition> conditionSet) {
        this.conditionSet = conditionSet;
    }
}
