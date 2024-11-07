package com.csc;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumberCalculator {

    // Method to calculate the nth triangular number using recursion
    public int value(int n) {
        if (n <= 1) {
            return n;
        }
        return n + value(n - 1);
    }

    // Method to add the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Method to subtract the nth triangular number from the mth triangular number
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }

    // Add-on: Method to multiply the nth and mth triangular numbers
    public int multiply(int n, int m) {
        int result = value(n) * value(m);
        return result;
    }

    // Add-on: Method to divide the nth triangular number by the mth triangular number
    public double divide(int n, int m) {
        int mValue = value(m);
        if (mValue == 0) throw new ArithmeticException("Cannot divide by zero");
        double result = (double) value(n) / mValue;
        return result;
    }

    // Add-on: Method to generate a sequence of triangular numbers up to the nth number
    public List<Integer> sequence(int n) {
        List<Integer> sequenceList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sequenceList.add(value(i));
        }
        return sequenceList;
    }
}
