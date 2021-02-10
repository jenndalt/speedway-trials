package com.galvanize.speedwaytrials.repository;

import com.galvanize.speedwaytrials.model.RaceCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Repository
public interface RaceCarRepository extends JpaRepository<RaceCar, UUID> {
}
