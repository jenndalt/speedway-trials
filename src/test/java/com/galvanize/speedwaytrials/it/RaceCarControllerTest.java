package com.galvanize.speedwaytrials.it;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RaceCarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getRaceCars() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/racecars"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.[0].id").exists())
                .andExpect(jsonPath("$.[0].nickname").value("The Condo"))
                .andExpect(jsonPath("$.[0].model").value("Corvette"))
                .andExpect(jsonPath("$.[0].owner").exists())
                .andExpect(jsonPath("$.[0].status").value("AVAILABLE"))
                .andExpect(jsonPath("$.[0].top_speed").value("189"));
    }

}
