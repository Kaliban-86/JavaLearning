package com.company;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i =  " + i);
        }

        for (int i = 10; i >= 0; i = i - 2) {
            System.out.println("i =  " + i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
