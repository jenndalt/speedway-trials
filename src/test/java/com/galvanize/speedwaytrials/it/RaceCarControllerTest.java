package com.galvanize.speedwaytrials.it;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.speedwaytrials.model.Driver;
import com.galvanize.speedwaytrials.model.RaceCar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RaceCarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getRaceCars() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/racecars"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.[0].id").exists())
                .andExpect(jsonPath("$.[0].nickname").value("The Condo"))
                .andExpect(jsonPath("$.[0].model").value("Corvette"))
                .andExpect(jsonPath("$.[0].driver").exists())
                .andExpect(jsonPath("$.[0].status").value("AVAILABLE"))
                .andExpect(jsonPath("$.[0].top_speed").value("189"));
    }

    @Test
    void addCare() throws Exception {
        RaceCar raceCar = new RaceCar("The Condo", "Corvette", "2019", new Driver(),  "AVAILABLE", 189);
        mockMvc.perform(MockMvcRequestBuilders.post("/v1/api/racecars")
                .content(objectMapper.writeValueAsString(raceCar))
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isCreated());
    }

}
