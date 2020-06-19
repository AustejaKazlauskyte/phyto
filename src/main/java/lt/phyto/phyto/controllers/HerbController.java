package lt.phyto.phyto.controllers;

import lt.phyto.phyto.models.dto.Herb;
import lt.phyto.phyto.models.entities.HerbEntity;
import lt.phyto.phyto.services.HerbService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(HerbController.BASE_URL)
public class HerbController {

    public static final String BASE_URL = "/api/herbs";

    private final HerbService herbService;

    public HerbController(HerbService herbService) {
        this.herbService = herbService;
    }


    @GetMapping
    List<HerbEntity> findAllHerbs() {
        return herbService.findAllHerbs();
    }

    /* Nelsono tutorialsas */

    @GetMapping("/{id}")
    public HerbEntity findHerbById(@PathVariable Long id) {
        return herbService.findHerbById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HerbEntity saveHerb(@RequestBody HerbEntity herbEntity) {
        return herbService.saveHerb(herbEntity);
    }
}
