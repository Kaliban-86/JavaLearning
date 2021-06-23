package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Введите Ваш возраст");
        age = sc.nextInt();
        switch (age){
            case 10 :
                System.out.println("Вам 10 лет");
                break;
            case 15 :
                System.out.println("Вам 15 лет");
                break;
            case 30 :
                System.out.println("Вам 30 лет");
                break;
            default:
                System.out.println("Сложный вопрос...");
        }
    }
}
