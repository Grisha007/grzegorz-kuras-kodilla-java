package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("Logs from console");
        String logs = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Logs from console", logs);
    }
}
