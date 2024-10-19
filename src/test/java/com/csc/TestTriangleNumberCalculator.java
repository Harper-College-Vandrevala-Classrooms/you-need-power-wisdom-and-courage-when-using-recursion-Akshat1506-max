package com.csc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

    TriangleNumberCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new TriangleNumberCalculator();
    }

    @Test
    void testValue() {
        assertEquals(1, calculator.value(1)); // T1 = 1
        assertEquals(3, calculator.value(2)); // T2 = 3
        assertEquals(6, calculator.value(3)); // T3 = 6
        assertEquals(10, calculator.value(4)); // T4 = 10
        assertEquals(15, calculator.value(5)); // T5 = 15
    }

    @Test
    void testAdd() {
        assertEquals(2, calculator.add(1, 1)); // T1 + T1 = 1 + 1 = 2
        assertEquals(9, calculator.add(2, 3)); // T2 + T3 = 3 + 6 = 9
        assertEquals(13, calculator.add(4, 2)); // T4 + T2 = 10 + 3 = 13
    }

    @Test
    void testSubtract() {
        assertEquals(0, calculator.subtract(1, 1)); // T1 - T1 = 1 - 1 = 0
        assertEquals(-3, calculator.subtract(2, 3)); // T2 - T3 = 3 - 6 = -3
        assertEquals(7, calculator.subtract(4, 2)); // T4 - T2 = 10 - 3 = 7
    }
}