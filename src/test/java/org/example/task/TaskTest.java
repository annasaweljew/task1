package org.example.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    private Task task;

    @BeforeEach
    void setUp() {
         task = new Task();
    }

    @Test
    public void should_sum_two_positive_values() {
        double a = 47;
        double b = 53;
        assertEquals(100, task.sum(a,b));
    }

    @Test
    public void should_sum_two_negative_values() {
        double a = -47;
        double b = -53;
        assertEquals(-100, task.sum(a,b));
    }

    @Test
    public void should_sum_two_decimal_values() {
        double a = 27.5487746;
        double b = 94.84745641;
        assertEquals(Math.round(122.40) , task.sum(a,b));
    }

    @Test
    public void should_sum_two_zero_values() {
        double a = 0;
        double b = 0;
        assertEquals(0, task.sum(a,b));
    }
}