package lt.phyto.phyto.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lt.phyto.phyto.configs.JwtAuthFilter;
import lt.phyto.phyto.converters.UserConverter;
import lt.phyto.phyto.models.dto.User;
import lt.phyto.phyto.models.entities.UserEntity;
import lt.phyto.phyto.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class SecurityService implements UserDetailsService {

    private final UserConverter userConverter;
    private final UserRepository userRepository;

    public SecurityService(UserConverter userConverter, UserRepository userRepository) {
        this.userConverter = userConverter;
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findOneByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("User \"%s\" not found", username));
        }

        return user;
    }

    public User signUp(User user) {
        UserEntity userEntity = userConverter.convert(user);

        UserEntity result = userRepository.save(userEntity);

        return userConverter.convert(result);
    }

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("subject", username);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JwtAuthFilter.VALIDITY))
                .signWith(SignatureAlgorithm.HS512, JwtAuthFilter.SECRET)
                .compact();
    }
}


