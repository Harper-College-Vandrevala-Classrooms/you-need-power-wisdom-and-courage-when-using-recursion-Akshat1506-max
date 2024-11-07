package com.csc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

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

    @Test
    void testMultiply() {
        assertEquals(1, calculator.multiply(1, 1)); // T1 * T1 = 1 * 1 = 1
        assertEquals(18, calculator.multiply(3, 2)); // T3 * T2 = 6 * 3 = 18
        assertEquals(225, calculator.multiply(5, 5)); // T5 * T5 = 15 * 15 = 225
    }

    @Test
    void testDivide() {
        double result1 = calculator.divide(1, 1);
        double result2 = calculator.divide(4, 2);
        double result3 = calculator.divide(5, 3);

        // Expected values:
        // Divide(1, 1): 1 / 1 = 1.0
        // Divide(4, 2): 10 / 3 ≈ 3.3333
        // Divide(5, 3): 15 / 6 = 2.5

        assertEquals(1.0, result1, 0.0001);
        assertEquals(3.3333, result2, 0.0001);
        assertEquals(2.5, result3, 0.0001);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testSequence() {
        List<Integer> expected = Arrays.asList(1, 3, 6, 10, 15);
        assertEquals(expected, calculator.sequence(5)); // T1, T2, T3, T4, T5
    }
}