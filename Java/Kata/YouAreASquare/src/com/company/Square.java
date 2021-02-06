package com.company;

public class Square {
    public static boolean isSquare(int n) {
        // checking if it's negative
        if (n < 0) {
            return false;
        }

        // finding the square root of N
        int test = (int)(Math.sqrt(n));
        // multiply the square root and check if it's equal to N
        return test * test == n;

        // other solution
        // return Math.sqrt(n) % 1 == 0;
    }
}