package lt.phyto.phyto.services;

import lt.phyto.phyto.models.entities.HerbEntity;
import lt.phyto.phyto.repositories.HerbRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HerbService {

  private final HerbRepository herbRepository;

  public HerbService(HerbRepository herbRepository) {
    this.herbRepository = herbRepository;
  }

  public HerbEntity findHerbById(Long id) {
    return herbRepository.findById(id).get();
  }

  public List<HerbEntity> findAllHerbs() {
    return herbRepository.findAll();
  }

  public HerbEntity saveHerb(HerbEntity herbEntity) {
    return herbRepository.save(herbEntity);
  }
}
