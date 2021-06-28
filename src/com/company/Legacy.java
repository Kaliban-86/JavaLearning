package com.company;

public class Legacy {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.run();
        an.swim();

        Dog dog1 = new Dog();
        dog1.run();
        dog1.swim();
        dog1.name = "Bob";
        dog1.showName();
        dog1.swim();
        an.showName();
    }
}

class Animal {
    String name;

    void run() {
        System.out.println("Я бегу...");
    }

    void swim() {
        System.out.println("Я плыву...");
    }

    void showName() {
        System.out.println(name);
    }
}

class Dog extends Animal {
    void swim() {
        System.out.println("Я плыву как собака, которую зовут " + name);
    }
}