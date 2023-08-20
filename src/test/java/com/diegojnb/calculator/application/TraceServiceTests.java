package com.diegojnb.calculator.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.diegojnb.calculator.infrastructure.service.TraceServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TraceServiceTests {

    @InjectMocks
    private TraceServiceImpl traceService;

    @Test
    public void testTraceOperation() {
        
    }
}
