package lt.phyto.phyto.converters;

import lt.phyto.phyto.models.dto.MedicalCondition;
import lt.phyto.phyto.models.entities.MedicalConditionEntity;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class MedicalConditionConverter {

  private final CharacteristicConverter characteristicConverter;

    public MedicalConditionConverter(CharacteristicConverter characteristicConverter) {
        this.characteristicConverter = characteristicConverter;
    }

    public Set<MedicalCondition> convert(Set<MedicalConditionEntity> conditions) {
        if (conditions == null) {
            return null;
        }

        return conditions.stream().map(this::convert).collect(Collectors.toSet());

    }

    public Set<MedicalConditionEntity> convertToEntity(Set<MedicalCondition> conditions) {
        if (conditions == null) {
            return null;
        }

        return conditions.stream().map(this::convertToEntity).collect(Collectors.toSet());

    }

  public MedicalConditionEntity convertToEntity(MedicalCondition medicalCondition) {
    if (medicalCondition == null) {
      return null;
    }

    MedicalConditionEntity result = new MedicalConditionEntity();
    result.setId(medicalCondition.getId());
    result.setTitle(medicalCondition.getTitle());
    result.setCharacteristics(characteristicConverter.convertToEntity(medicalCondition.getCharacteristics()));

    return result;
  }

  public MedicalCondition convert(MedicalConditionEntity medicalConditionEntity) {
    if (medicalConditionEntity == null) {
      return null;
    }

    MedicalCondition result = new MedicalCondition();
    result.setId(medicalConditionEntity.getId());
    result.setTitle(medicalConditionEntity.getTitle());
    result.setCharacteristics(characteristicConverter.convert(medicalConditionEntity.getCharacteristics()));

    return result;
  }
}
