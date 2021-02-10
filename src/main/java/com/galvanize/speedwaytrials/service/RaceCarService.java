package com.galvanize.speedwaytrials.service;

import com.galvanize.speedwaytrials.model.Driver;
import com.galvanize.speedwaytrials.model.RaceCar;
import com.galvanize.speedwaytrials.repository.RaceCarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceCarService {
    private RaceCarRepository raceCarRepository;

    public RaceCarService(RaceCarRepository raceCarRepository) {
        this.raceCarRepository = raceCarRepository;
        seedData();
    }

    public List<RaceCar> getAllRaceCars() {
        return raceCarRepository.findAll();
    }

    public void seedData() {
        RaceCar raceCar = new RaceCar("The Condo", "Corvette", "2019", new Driver(),  "AVAILABLE", 189);
        raceCarRepository.save(raceCar);
    }
}
