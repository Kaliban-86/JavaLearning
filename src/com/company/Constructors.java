package com.company;

public class Constructors {
    public static void main(String[] args) {

        Man vadim = new Man( 35);
    }
}

class Man {
    String name;
    int age;

    Man() {
        System.out.println("Привет из первого конструктора");
    }

    Man(String name) {
        this.name = name;
        System.out.println("Привет из второго конструктора");
    }

    Man(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("привет из третьего конструктора");
    }

    Man(int age) {
        this.age = age;
        System.out.println("привет из четветрого конструктора");
    }

}