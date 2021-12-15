package org.example.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}