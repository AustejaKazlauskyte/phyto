package lt.phyto.phyto.converters;

import lt.phyto.phyto.models.dto.Characteristic;
import lt.phyto.phyto.models.entities.CharacteristicEntity;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CharacteristicConverter {

  private final MedicalConditionConverter medicalConditionConverter;

  public CharacteristicConverter(MedicalConditionConverter medicalConditionConverter) {
    this.medicalConditionConverter = medicalConditionConverter;
  }

  public Set<Characteristic> convert(Set<CharacteristicEntity> characteristics) {
    if (characteristics == null) {
      return null;
    }

    return characteristics.stream().map(this::convert).collect(Collectors.toSet());

  }

  public Set<CharacteristicEntity> convertToEntity(Set<Characteristic> characteristics) {
    if (characteristics == null) {
      return null;
    }

    return characteristics.stream().map(this::convertToEntity).collect(Collectors.toSet());

  }

  public CharacteristicEntity convertToEntity(Characteristic characteristic) {

    if (characteristic == null) {
      return null;
    }

    CharacteristicEntity result = new CharacteristicEntity();
    result.setId(characteristic.getId());
    result.setTitle(characteristic.getTitle());
    result.setConditions(medicalConditionConverter.convertToEntity(characteristic.getMedicalConditions()));
    result.setChild(characteristic.isChild());
    result.setPregnant(characteristic.isPregnant());
    result.setHasHighBloodPressure(characteristic.isHasHighBloodPressure());

    return result;
  }

  public Characteristic convert(CharacteristicEntity characteristicEntity) {

    if (characteristicEntity == null) {
      return null;
    }

    Characteristic result = new Characteristic();
    result.setId(characteristicEntity.getId());
    result.setTitle(characteristicEntity.getTitle());
    result.setMedicalConditions(medicalConditionConverter.convert(characteristicEntity.getConditions()));
    result.setChild(characteristicEntity.isChild());
    result.setPregnant(characteristicEntity.isPregnant());
    result.setHasHighBloodPressure(characteristicEntity.isHasHighBloodPressure());

    return result;
  }
}
