package lt.phyto.phyto.converters;

import lt.phyto.phyto.models.dto.User;
import lt.phyto.phyto.models.entities.UserEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

  public UserEntity convert(User user) {
    if (user == null) {
      return null;
    }

    UserEntity result = new UserEntity();
    result.setId(user.getId());
    result.setName(user.getName());
    result.setEmail(user.getEmail());
    result.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

    return result;
  }

  public User convert(UserEntity userEntity) {
    if (userEntity == null) {
      return null;
    }

    User result = new User();
    result.setId(userEntity.getId());
    result.setName(userEntity.getName());
    result.setEmail(userEntity.getEmail());

    return result;
  }
}
