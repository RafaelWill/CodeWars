package com.company;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        if (arr.isEmpty()) {
            return 0;
        }
        int counter = 0;
        for (String smiley : arr){
            if ((smiley.equals(":)")) || (smiley.equals(";)"))|| (smiley.equals(";-)")) || (smiley.equals(":-)")) || (smiley.equals(":~)")) || (smiley.equals(";~)"))) {
                counter ++;
            }
            if ((smiley.equals(":D")) || (smiley.equals(";D"))|| (smiley.equals(";-D")) || (smiley.equals(":-D")) || (smiley.equals(":~D")) || (smiley.equals(";~D"))) {
                counter ++;
            }
        }
        return counter;
    }

    // other solution:
    // -----------------
    // return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();


}
