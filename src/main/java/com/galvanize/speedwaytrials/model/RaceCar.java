package com.galvanize.speedwaytrials.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RaceCar {
    @Id
    @GeneratedValue
    private UUID id;
    private String nickname;
    private String model;
    private String year;
    private String owner;
    private String status;
    private Integer top_speed;

    public RaceCar(String nickname, String model, String year, String owner, String status, Integer top_speed) {
        this.nickname = nickname;
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.status = status;
        this.top_speed = top_speed;
    }
}
