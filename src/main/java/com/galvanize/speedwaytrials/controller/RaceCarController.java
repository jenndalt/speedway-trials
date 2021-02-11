package com.galvanize.speedwaytrials.controller;

import com.galvanize.speedwaytrials.model.RaceCar;
import com.galvanize.speedwaytrials.service.RaceCarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/racecars")
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
    public RaceCar postRaceCar(@RequestBody RaceCar raceCar) {
        return raceCarService.addCar(raceCar);
    }
}
