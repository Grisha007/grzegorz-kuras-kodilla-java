package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        Logger logger1 = new Logger();
        //When
        logger1.log("Logs from console");
        String logs = logger1.getLastLog();
        //Then
        Assert.assertEquals("Logs from console", logs);
    }
}
