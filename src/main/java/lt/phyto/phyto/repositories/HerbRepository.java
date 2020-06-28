package lt.phyto.phyto.repositories;

import lt.phyto.phyto.models.entities.HerbEntity;
import org.springframework.data.repository.Repository;

public interface HerbRepository extends Repository<HerbEntity, Long> {

  HerbEntity findOneById(long id);
  
}
