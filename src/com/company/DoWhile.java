package com.company;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;

        do {
            System.out.println("Введите число раное 5");
            value = sc.nextInt();
        } while (value != 5);
        System.out.println("Вы ввели число равное 5");
    }
}
