package lt.phyto.phyto.converters;

import lt.phyto.phyto.models.dto.Herb;
import lt.phyto.phyto.models.entities.HerbEntity;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class HerbConverter {

  private final CharacteristicConverter characteristicConverter;
  private final MedicalConditionConverter medicalConditionConverter;

  public HerbConverter(
      CharacteristicConverter characteristicConverter,
      MedicalConditionConverter medicalConditionConverter) {
    this.characteristicConverter = characteristicConverter;
    this.medicalConditionConverter = medicalConditionConverter;
  }

  public Set<Herb> convert(Set<HerbEntity> herbs) {
    if (herbs == null) {
      return null;
    }

    return herbs.stream().map(this::convert).collect(Collectors.toSet());
  }

  public Set<HerbEntity> convertToEntity(Set<Herb> herbs) {
    if (herbs == null) {
      return null;
    }

    return herbs.stream().map(this::convertToEntity).collect(Collectors.toSet());
  }

  public HerbEntity convertToEntity(Herb herb) {
    if (herb == null) {
      return null;
    }

    HerbEntity result = new HerbEntity();
    result.setId(herb.getId());
    result.setName(herb.getName());
    result.setCharacteristics(characteristicConverter.convertToEntity(herb.getCharacteristics()));
    result.setMedicalConditions(
        medicalConditionConverter.convertToEntity(herb.getMedicalConditions()));

    return result;
  }

  public Herb convert(HerbEntity herbEntity) {
    if (herbEntity == null) {
      return null;
    }

    Herb result = new Herb();
    result.setId(herbEntity.getId());
    result.setName(herbEntity.getName());
    result.setCharacteristics(characteristicConverter.convert(herbEntity.getCharacteristics()));
    result.setMedicalConditions(
        medicalConditionConverter.convert(herbEntity.getMedicalConditions()));

    return result;
  }
}
