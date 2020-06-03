package lt.phyto.phyto.repositories;

import lt.phyto.phyto.models.entities.HerbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HerbRepository extends JpaRepository<HerbEntity, Long> {

}
