package com.galvanize.speedwaytrials.controller;

import com.galvanize.speedwaytrials.model.Driver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {

    @GetMapping("/api/v1/drivers")
    public List<Driver> getAllDrivers() {
        return null;
    }
}
