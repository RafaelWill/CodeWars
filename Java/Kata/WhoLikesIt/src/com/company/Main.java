package com.company;

public class Main {

    public static void main(String[] args) {

//        likes1 {} // must be "no one likes this"
//        likes2 {"Peter"} // must be "Peter likes this"
//        likes3 {"Jacob", "Alex"} // must be "Jacob and Alex like this"
//        likes4 {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
//        likes5 {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"

        String[] likes1 = {};
        String[] likes2 = {"Peter"};
        String[] likes3 = {"Jacob","Alex"};
        String[] likes4 = {"Max","John","Mark"};
        String[] likes5 = {"Alex", "Jacob", "Mark", "Max"};

        System.out.println(WhoLikesIt.whoLikesIt(likes1));
        System.out.println(WhoLikesIt.whoLikesIt(likes2));
        System.out.println(WhoLikesIt.whoLikesIt(likes3));
        System.out.println(WhoLikesIt.whoLikesIt(likes4));
        System.out.println(WhoLikesIt.whoLikesIt(likes5));

    }
}
