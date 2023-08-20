package com.diegojnb.calculator.infrastructure.adapter.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.diegojnb.calculator.application.CalculatorService;
import com.diegojnb.calculator.application.TraceService;

import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CalculatorService calculatorService;

    @MockBean
    private TraceService traceService;

    @Test
    void testSum() throws Exception {
        double expectedResult = 8;
        double v1 = 5;
        double v2 = 3;
        when(calculatorService.sum(any(), any())).thenReturn(expectedResult);
        mockMvc.perform(get("/sum").param("v1", String.valueOf(v1)).param("v2", String.valueOf(v2)))
            .andExpect(status().isOk())
            .andExpect(content().string(String.valueOf(expectedResult)));
    }

    @Test
    void testSubtract() throws Exception {
        double expectedResult = 7;
        double v1 = 10;
        double v2 = 3;
        when(calculatorService.substract(any(), any())).thenReturn(expectedResult);
        mockMvc.perform(get("/substract").param("v1", String.valueOf(v1)).param("v2", String.valueOf(v2)))
            .andExpect(status().isOk())
            .andExpect(content().string(String.valueOf(expectedResult)));
    }
}

