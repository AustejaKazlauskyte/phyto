package lt.phyto.phyto.services;

import lt.phyto.phyto.models.entities.HerbEntity;

import java.util.List;

public interface HerbService {
    HerbEntity findHerbById(Long id);
    List<HerbEntity> findAllHerbs();

    HerbEntity saveHerb(HerbEntity herbEntity);

}
