package lt.phyto.phyto.repositories;

import lt.phyto.phyto.models.entities.CharacteristicEntity;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface CharacteristicRepository extends Repository<CharacteristicEntity, Long> {
}
