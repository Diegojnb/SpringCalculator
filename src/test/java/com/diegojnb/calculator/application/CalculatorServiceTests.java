package com.diegojnb.calculator.application;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.diegojnb.calculator.infrastructure.service.CalculatorServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTests {

    @InjectMocks
    private CalculatorServiceImpl calculatorService;

    @Test
    public void testSum() {
        Double result = calculatorService.sum(5.0, 3.0);
        assertEquals(8.0, result);
    }

    @Test
    public void testSubtract() {
        Double result = calculatorService.substract(10.0, 3.0);
        assertEquals(7.0, result, 0.01);
    }
}

