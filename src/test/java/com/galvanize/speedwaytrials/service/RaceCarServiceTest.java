package com.galvanize.speedwaytrials.service;

import com.galvanize.speedwaytrials.model.RaceCar;
import com.galvanize.speedwaytrials.repository.RaceCarRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RaceCarServiceTest {
    @Mock
    RaceCarRepository raceCarRepository;

    @InjectMocks
    RaceCarService carService;

    @Test
    void getAllCars() {
        RaceCar raceCar = new RaceCar();
        when(raceCarRepository.findAll()).thenReturn(Arrays.asList(raceCar, raceCar, raceCar));
        List<RaceCar> carList = carService.getAllRaceCars();
        assertEquals(3, carList.size());
    }
}