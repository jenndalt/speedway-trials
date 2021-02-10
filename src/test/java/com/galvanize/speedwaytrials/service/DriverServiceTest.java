package com.galvanize.speedwaytrials.service;

import com.galvanize.speedwaytrials.model.Driver;
import com.galvanize.speedwaytrials.model.RaceCar;
import com.galvanize.speedwaytrials.repository.DriverRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DriverServiceTest {
    @Mock
    DriverRepository driverRepository;

    @InjectMocks
    DriverService driverService;

    @Test
    void getAllDrivers() {
        Driver driver = new Driver();
        when(driverRepository.findAll()).thenReturn(Arrays.asList(driver, driver, driver));
        List<Driver> driverList = driverService.getAllDrivers();
        assertEquals(3, driverList.size());
    }

}