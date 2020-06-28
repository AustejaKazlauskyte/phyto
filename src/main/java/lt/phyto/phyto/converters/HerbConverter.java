package lt.phyto.phyto.converters;

import lt.phyto.phyto.models.dto.Herb;
import lt.phyto.phyto.models.entities.HerbEntity;
import org.springframework.stereotype.Component;


@Component
public class HerbConverter {

    public HerbEntity convert(Herb herb) {
        if (herb == null) {
            return null;
        }

        HerbEntity result = new HerbEntity();
        result.setId(herb.getId());
        result.setName(herb.getName());
        result.setCharacteristics(herb.getCharacteristics());
        result.setMedicalConditions(herb.getMedicalConditions());

        return result;
    }

    public Herb convert(HerbEntity herbEntity) {
        if (herbEntity == null) {
            return null;
        }

        Herb result = new Herb();
        result.setId(herbEntity.getId());
        result.setName(herbEntity.getName());
        result.setCharacteristics(herbEntity.getCharacteristics());
        result.setMedicalConditions(herbEntity.getMedicalConditions());

        return result;
    }
}
