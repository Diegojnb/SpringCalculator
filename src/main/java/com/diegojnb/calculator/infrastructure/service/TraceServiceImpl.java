package com.diegojnb.calculator.infrastructure.service;

import org.springframework.stereotype.Component;

import com.diegojnb.calculator.application.TraceService;

import io.corp.calculator.TracerImpl;

@Component
public class TraceServiceImpl implements TraceService {

    private TracerImpl tracer = new TracerImpl();

    @Override
    public void traceOperation(String operation, Object result) {
        tracer.trace(result);
    }
}
