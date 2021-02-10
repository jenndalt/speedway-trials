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
public class DriverITControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllDrivers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/drivers"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.[0].id").exists())
                .andExpect(jsonPath("$.[0].first-name").value("Maria"))
                .andExpect(jsonPath("$.[0].last-name").value("Lopez"))
                .andExpect(jsonPath("$.[0].age").value("22"))
                .andExpect(jsonPath("$.[0].nickname").value("The Blaze"))
                .andExpect(jsonPath("$.[0].cars").exists())
                .andExpect(jsonPath("$.[0].wins").value("4"))
                .andExpect(jsonPath("$.[0].losses").value("1"))
        ;
    }
}