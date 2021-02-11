package com.galvanize.speedwaytrials.controller;

import com.galvanize.speedwaytrials.model.RaceCar;
import com.galvanize.speedwaytrials.service.RaceCarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/racecars")
public class RaceCarController {
    private final RaceCarService raceCarService;

    public RaceCarController(RaceCarService raceCarService) {
        this.raceCarService = raceCarService;
    }

    @GetMapping
    public List<RaceCar> getRaceCars() {
        return raceCarService.getAllRaceCars();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postRaceCar(@RequestBody RaceCar raceCar) {
        raceCarService.addCar(raceCar);
    }
}
