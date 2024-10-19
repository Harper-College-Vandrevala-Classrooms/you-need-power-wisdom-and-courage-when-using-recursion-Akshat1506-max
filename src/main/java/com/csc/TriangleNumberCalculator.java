package com.csc;

public class TriangleNumberCalculator {

    // Method to calculate the nth triangular number using recursion
    public int value(int n) {
        if (n == 1) {
            return 1;
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
}