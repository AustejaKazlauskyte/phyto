package lt.phyto.phyto.controllers;

import lt.phyto.phyto.models.dto.Herb;
import lt.phyto.phyto.services.HerbService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping(HerbController.BASE_URL)
public class HerbController {

  public static final String BASE_URL = "/api/herbs";

  private final HerbService herbService;

  public HerbController(HerbService herbService) {
    this.herbService = herbService;
  }

  @GetMapping
  public Set<Herb> findAllHerbs() {
    return herbService.getAllHerbs();
  }

  @GetMapping("/{id}")
  public Herb findHerbById(@PathVariable Long id) {
    return herbService.getHerb(id);
  }

  @PostMapping
  public Herb save(@RequestBody @Valid Herb herb) {
    return herbService.save(herb);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    herbService.delete(id);

    return ResponseEntity.status(HttpStatus.OK).build();
  }
}
