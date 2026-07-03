package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("Assertion Demonstration");

        System.out.println("2 + 3 = " + (2 + 3));
        System.out.println("Is 5 > 3? " + (5 > 3));
        System.out.println("Is 5 < 3? " + (5 < 3));

        Object obj1 = null;
        Object obj2 = new Object();

        System.out.println("obj1 is null: " + (obj1 == null));
        System.out.println("obj2 is null: " + (obj2 == null));
    }
}
