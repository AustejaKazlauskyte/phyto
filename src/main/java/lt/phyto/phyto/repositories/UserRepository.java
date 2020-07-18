package lt.phyto.phyto.repositories;

import lt.phyto.phyto.models.entities.UserEntity;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<UserEntity, Long> {

  UserEntity findOneByEmail(String email);

  UserEntity save(UserEntity user);
}
