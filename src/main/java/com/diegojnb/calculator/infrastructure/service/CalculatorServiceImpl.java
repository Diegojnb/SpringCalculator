package com.diegojnb.calculator.infrastructure.service;

import org.springframework.stereotype.Service;

import com.diegojnb.calculator.application.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double substract(Double a, Double b) {
        return a - b;
    }
}
