package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int test = 1234;
        int test2 = 157280;

        System.out.println(squareDigits(test));
        System.out.println(squareDigits(test2));

    }

    public static int squareDigits (int n) {
        String numberString = Integer.toString(n);
        String result = "";


        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            int squareDigit = digit * digit;
            result += (Integer.toString(squareDigit));
        }

        return Integer.parseInt(result);

        // other solution:
        // ---------------
        //  String result = "";
        //
        //    while (n != 0) {
        //      int digit = n % 10 ;
        //      result = digit*digit + result ;
        //      n /= 10 ;
        //    }
        //
        //    return Integer.parseInt(result) ;
    }
}
