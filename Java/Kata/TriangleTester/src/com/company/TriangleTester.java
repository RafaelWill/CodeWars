package com.company;

import java.util.*;

class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0) {
            return false;
        }

        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }

        // other solution
        // return a + b > c && a + c > b && b + c > a;



    }
}
