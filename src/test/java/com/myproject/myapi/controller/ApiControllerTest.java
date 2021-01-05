package com.myproject.myapi.controller;

import com.myproject.myapi.model.Worker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public class ApiControllerTest {

    private ApiController apiControllerUnderTest;

    @Before
    public void setUp() {
        apiControllerUnderTest = new ApiController();
    }

    @Test
    public void testGetData() throws IOException {
        // Setup

        // Run the test
        final ResponseEntity<Worker> result = apiControllerUnderTest.getData("W1");
        // Verify the results
        Assert.assertEquals("W1",result.getBody().getWorkerID());
        Assert.assertEquals("aworker",result.getBody().getWorkerName());
        Assert.assertEquals("0 core(s) in use",result.getBody().getCpuUsage());
        Assert.assertEquals("1% 1.726 GiB/125.9 GiB",result.getBody().getRam());
        Assert.assertEquals("GeForce RTX 2070, not used",result.getBody().getGpu());
        Assert.assertEquals("0% 1.726 GiB/261.9 GiB",result.getBody().getvRam());
    }
}
