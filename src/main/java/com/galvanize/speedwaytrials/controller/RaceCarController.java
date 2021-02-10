package com.galvanize.speedwaytrials.controller;

import com.galvanize.speedwaytrials.model.RaceCar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RaceCarController {

    @GetMapping("/api/v1/racecars")
    public void getRaceCars(){

        RaceCar raceCar = new Racecar();

    }
}
