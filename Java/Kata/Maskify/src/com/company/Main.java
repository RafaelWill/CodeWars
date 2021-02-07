package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));

        System.out.println(maskify("Skippy"));
        System.out.println(maskify("Nananananananananananananananana Batman!"));

        System.out.println(maskify("Nele Peetermans"));
    }

    public static String maskify(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() < 4) {
            return str;
        }

        String newString = "";
        for (int i = 0; i < str.length() - 4; i++){
            newString = newString + "#";
        }

        newString = newString + str.substring(str.length() -4);
        return newString;
    }

    // other solution:
    // ---------------
    //  public static String maskify(String str) {
    //        return str.replaceAll(".(?=.{4})", "#");
    //  }
}
