package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(132189));
        System.out.println(digital_root(493193));
        System.out.println(digital_root(0));
        System.out.println(digital_root(7));
    }

    public static int digital_root(int n) {

        return (n != 0 && n%9 == 0) ? 9 : n % 9;

        // other solution:
        // ---------------
        //    int sum = 0;
        //
        //    while (n > 0) {
        //        sum += n % 10;
        //        n = n / 10;
        //    }
        //
        //    if (sum < 10) {
        //       return sum;
        //    } else {
        //       return digital_root(sum);
        //    }
    }
}
