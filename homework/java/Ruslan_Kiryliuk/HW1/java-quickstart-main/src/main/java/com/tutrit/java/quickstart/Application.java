package com.tutrit.java.quickstart;

public class Application {

    public static void main(String[] args) {
        int rand = (int) (Math.random() * 10);
        int b = rand % 2;
        if (b == 0) {
            System.out.println("Орел");

        } else {
            System.out.println("Решка");

        }

    }
}

