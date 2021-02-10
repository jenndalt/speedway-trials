package com.galvanize.speedwaytrials.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
public class Driver {
    @Id
    @GeneratedValue
    private UUID id;
    @JsonProperty("first-name")
    String firstName;
    @JsonProperty("last-name")
    String lastName;
    Integer age;
    String nickname;
    @OneToMany(mappedBy = "driver")
    @JsonIgnoreProperties("driver")
    List<RaceCar> raceCarList;
    Integer wins;
    Integer losses;

    public Driver(String firstName, String lastName, Integer age, String nickname, List<RaceCar> raceCarList, Integer wins, Integer losses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nickname = nickname;
        this.raceCarList = raceCarList;
        this.wins = wins;
        this.losses = losses;
    }
}
