package org.example.task;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TaskTest {

    private final TestLogger logger = new TestLogger();

    @Test
    void should_sum_two_positive_values() {
        double a = 47;
        double b = 53;
        var result = Task.sum(a,b);
        logger.logSingleTestResult("should_sum_two_positive_values", result==100);
        assertEquals(100, result);
    }

    @Test
    void should_sum_two_negative_values() {
        double a = -47;
        double b = -53;
        var result = Task.sum(a,b);
        logger.logSingleTestResult("should_sum_two_negative_values", result==-100);
        assertEquals(-100, result);
    }

    @Test
    void should_sum_two_decimal_values() {
        double a = 27.5487746;
        double b = 94.84745641;
        var result = Task.sum(a,b);
        logger.logSingleTestResult("should_sum_two_decimal_values", result==Math.round(122.40));
        assertEquals(Math.round(122.40) , result);
    }

    @Test
    void should_sum_two_zero_values() {
        double a = 0;
        double b = 0;
        var result = Task.sum(a,b);
        logger.logSingleTestResult("should_sum_two_zero_values", result==0);
        assertEquals(0, result);
    }

    @AfterAll
    void logTestResults() {
        logger.saveResults();
    }
}