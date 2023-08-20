package com.diegojnb.calculator.application;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        traceService.traceOperation("Test", "1.0");
        assertTrue(traceService!=null);
    }
}
