package com.diegojnb.calculator.infrastructure.adapter.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diegojnb.calculator.application.CalculatorService;
import com.diegojnb.calculator.application.TraceService;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;
    private final TraceService traceService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService, TraceService traceService) {
        this.calculatorService = calculatorService;
        this.traceService = traceService;
    }

    @GetMapping(value = "/sum", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Double> add(@RequestParam double v1, @RequestParam double v2) {
        double result = calculatorService.sum(v1, v2);
        traceService.traceOperation("Sum", result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/substract", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Double> subtract(@RequestParam double v1, @RequestParam double v2) {
        double result = calculatorService.substract(v1, v2);
        traceService.traceOperation("Substract", result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
