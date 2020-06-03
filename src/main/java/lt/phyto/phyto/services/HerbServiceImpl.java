package lt.phyto.phyto.services;

import lt.phyto.phyto.models.entities.HerbEntity;
import lt.phyto.phyto.repositories.HerbRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HerbServiceImpl implements HerbService {

  private final HerbRepository herbRepository;

  public HerbServiceImpl(HerbRepository herbRepository) {
    this.herbRepository = herbRepository;
  }

  @Override
  public HerbEntity findHerbById(Long id) {
    return null;
    /*return herbRepository.findById(id).get();*/
  }

  @Override
    public List<HerbEntity> findAllHerbs() {
      return herbRepository.findAll();
  }

  @Override
    public HerbEntity saveHerb(HerbEntity herbEntity) {
      return herbRepository.save(herbEntity);
  }
}
