package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String name;
        int age;
        String prof;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Введите Ваше имя");
        name = sc.nextLine();
        System.out.println("Введите Ваш возраст");
        age = sc.nextInt();
        System.out.println("Введите Вашу профессию");
        prof = sc2.nextLine();
        System.out.println(name + " " + age + " " + prof);
    }
}
