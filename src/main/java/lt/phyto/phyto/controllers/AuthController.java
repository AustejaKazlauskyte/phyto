package lt.phyto.phyto.controllers;

import lt.phyto.phyto.models.dto.Token;
import lt.phyto.phyto.models.dto.User;
import lt.phyto.phyto.services.SecurityService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AuthController {

  private final AuthenticationManager authenticationManager;
  private final SecurityService securityService;

  public AuthController(
      AuthenticationManager authenticationManager, SecurityService securityService) {
    this.authenticationManager = authenticationManager;
    this.securityService = securityService;
  }

  @PostMapping("/login")
  public Token authenticate(@RequestBody User user) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
    return new Token(securityService.generateToken(user.getEmail()));
  }

  @PostMapping("/sign-up")
  public User signUp(@RequestBody User user) {
    return securityService.signUp(user);
  }
}
