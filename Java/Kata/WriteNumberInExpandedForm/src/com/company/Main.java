package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(expandedForm(16));
        System.out.println(expandedForm(120));
        System.out.println(expandedForm(8493));
        System.out.println(expandedForm(17612));
        System.out.println(expandedForm(10010));
    }

    public static String expandedForm(int num) {
        int multiplication = 1;
        String expandedForm = "";

        while (num > 0) {
            int digit = num % 10; // take last digit
            if (digit > 0) {
                if (expandedForm.length() == 0) {
                    expandedForm = Integer.toString(digit * multiplication);
                } else {
                    expandedForm = Integer.toString(digit * multiplication) + " + " + expandedForm;
                }
            }
            num = num / 10; // remove last digit
            multiplication *= 10; // increase the multiplication
        }
        return expandedForm;

        // other solution:
        // ---------------
        //  public static String expandedForm(int num)
        //    {
        //        String outs = "";
        //        for (int i = 10; i < num; i *= 10) {
        //            int rem = num % i;
        //            outs = (rem > 0) ? " + " + rem + outs : outs;
        //            num -= rem;
        //        }
        //        outs = num + outs;
        //
        //        return outs;
        //    }
    }
}
