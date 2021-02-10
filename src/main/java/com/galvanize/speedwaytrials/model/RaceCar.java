package com.galvanize.speedwaytrials.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RaceCar {

    private UUID id;
    private String nickname;
    private String  year;
    private Driver owner;
    private String status;
    private Integer top_speed;
}
