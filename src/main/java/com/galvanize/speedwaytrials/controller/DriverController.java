package com.galvanize.speedwaytrials.controller;

import com.galvanize.speedwaytrials.model.Driver;
import com.galvanize.speedwaytrials.service.DriverService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("/api/v1/drivers")
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }
}
