package com.galvanize.speedwaytrials.service;

import com.galvanize.speedwaytrials.repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
}
