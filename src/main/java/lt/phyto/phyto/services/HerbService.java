package lt.phyto.phyto.services;

import lt.phyto.phyto.converters.HerbConverter;
import lt.phyto.phyto.models.dto.Herb;
import lt.phyto.phyto.models.entities.HerbEntity;
import lt.phyto.phyto.repositories.HerbRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class HerbService {

  private final HerbConverter herbConverter;
  private final HerbRepository herbRepository;

  public HerbService(HerbConverter herbConverter, HerbRepository herbRepository) {
    this.herbConverter = herbConverter;
    this.herbRepository = herbRepository;
  }

  public Herb getHerb(Long id) {
    HerbEntity herbEntity = herbRepository.findOneById(id);
    return herbConverter.convert(herbEntity);
  }

  public Set<Herb> getAllHerbs() {
    Set<HerbEntity> herbEntities = herbRepository.findAll();
    return herbConverter.convert(herbEntities);
  }

  public Herb save(Herb herb) {
    HerbEntity herbEntity = herbConverter.convertToEntity(herb);
    HerbEntity result = herbRepository.save(herbEntity);
    return herbConverter.convert(result);
  }

  @Transactional
  public void delete(Long id) {
    herbRepository.deleteOneById(id);
  }

}
