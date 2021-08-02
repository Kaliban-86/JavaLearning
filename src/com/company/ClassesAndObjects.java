package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Вадим";
        person1.age = 35;
        person1.sayHellow();
        person1.speak();
        System.out.println("До пенсии осталось " + person1.calculateAgeTo(person1.age));

        Person person2 = new Person();
        person2.name = "Женя";
        person2.age = 30;
        person2.sayHellow();
        person2.speak();
        System.out.println("До пенсии осталось " + person2.calculateAgeTo(person2.age));

        Person person3 = new Person();
        person3.setNameAndage(6, "Русланчик");
        person3.speak();

        // System.out.println("Привет, меня зовут " + person1.name + " и мне " + person1.age + " лет!");
        //System.out.println("Привет, меня зовут " + person2.name + " и мне " + person2.age + " лет!");
        new Person().setNameAndage(35, "Vadim");
        new Person().speak();
    }
}

class Person {
    String name;
    int age;

    void setNameAndage(int userAge, String userName) {
        name = userName;
        age = userAge;
    }

    void speak() {
        System.out.println("Привет, меня зовут " + name + " и мне " + age + " лет!");
    }

    void sayHellow() {
        System.out.println("Тебе привет от " + name);
    }

    int calculateAgeTo(int userAge) {
        return 60 - userAge;
    }
}