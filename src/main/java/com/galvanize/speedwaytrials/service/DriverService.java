package com.galvanize.speedwaytrials.service;

import com.galvanize.speedwaytrials.model.Driver;
import com.galvanize.speedwaytrials.model.RaceCar;
import com.galvanize.speedwaytrials.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
        seedData();
    }

    public List<Driver> getAllDrivers() {
        return this.driverRepository.findAll();
    }

    private void seedData() {
        RaceCar raceCar = new RaceCar("The Condo", "Corvette", "2019", new Driver(),  "AVAILABLE", 189);
        RaceCar raceCar2 = new RaceCar("Viper", "Corvette", "2020", new Driver(),  "AVAILABLE", 220);

        Driver driver = new Driver("Maria", "Lopez", 22, "The Blaze", Arrays.asList(raceCar, raceCar2), 4, 1);
        driverRepository.save(driver);
    }
}
