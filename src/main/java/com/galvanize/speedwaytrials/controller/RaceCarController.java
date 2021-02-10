package com.galvanize.speedwaytrials.controller;

import com.galvanize.speedwaytrials.model.RaceCar;
import com.galvanize.speedwaytrials.service.RaceCarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RaceCarController {
    private final RaceCarService raceCarService;

    public RaceCarController(RaceCarService raceCarService) {
        this.raceCarService = raceCarService;
    }

    @GetMapping("/api/v1/racecars")
    public List<RaceCar> getRaceCars() {
        return raceCarService.getAllRaceCars();
    }
}
