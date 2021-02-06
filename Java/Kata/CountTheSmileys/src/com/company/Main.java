package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        // output should be 1

        List<String> b = new ArrayList<>();
        b.add(":)"); b.add(":)"); b.add("x-]"); b.add(":ox"); b.add(";-("); b.add(";-)"); b.add(";~("); b.add(":~D");
        // output should be 4

        System.out.println(SmileFaces.countSmileys(a));
        System.out.println(SmileFaces.countSmileys(b));
    }
}
