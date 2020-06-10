package lt.phyto.phyto.models.dto;

import java.util.HashSet;
import java.util.Set;

public class Condition {
    private Long id;
    private String title;
    private HashSet<Herb> herbs;
    private HashSet<Property> properties;

    public Condition() {
    }

    public Condition(Long id, String title, HashSet<Herb> herbs, HashSet<Property> properties) {
        this.id = id;
        this.title = title;
        this.herbs = herbs;
        this.properties = properties;
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

    @Override
    public String toString() {
        return "Condition{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", herbs=" + herbs +
                ", properties=" + properties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Condition condition = (Condition) o;

        return id.equals(condition.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
