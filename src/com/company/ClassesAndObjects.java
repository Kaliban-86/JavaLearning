package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Вадим";
        person1.age = 35;
        person1.sayHellow();
        person1.speak();
        System.out.println("До пенсии осталось " + person1.calculateAgeTo());

        Person person2 = new Person();
        person2.name = "Женя";
        person2.age = 30;
        person2.sayHellow();
        person2.speak();
        System.out.println("До пенсии осталось " + person2.calculateAgeTo());

        // System.out.println("Привет, меня зовут " + person1.name + " и мне " + person1.age + " лет!");
        //System.out.println("Привет, меня зовут " + person2.name + " и мне " + person2.age + " лет!");

    }
}

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("Привет, меня зовут " + name + " и мне " + age + " лет!");
    }

    void sayHellow() {
        System.out.println("Тебе привет от " + name);
    }

    int calculateAgeTo() {
        return 60 - age;
    }
}