package lt.phyto.phyto.repositories;

import lt.phyto.phyto.models.entities.HerbEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Set;

public interface HerbRepository extends Repository<HerbEntity, Long> {

  HerbEntity findOneById(long id);

  Set<HerbEntity> findAll();
}
