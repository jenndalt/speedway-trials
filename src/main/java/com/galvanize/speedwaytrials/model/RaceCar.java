package com.galvanize.speedwaytrials.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
public class RaceCar {
    @Id
    @GeneratedValue
    private UUID id;
    private String nickname;
    private String model;
    private String year;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("raceCarList")
    private Driver driver;
    private String status;
    private Integer top_speed;
    public RaceCar(String nickname, String model, String year, Driver driver, String status, Integer top_speed) {
        this.nickname = nickname;
        this.model = model;
        this.year = year;
        this.driver = driver;
        this.status = status;
        this.top_speed = top_speed;
    }
}
