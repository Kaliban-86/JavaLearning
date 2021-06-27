package com.company;

public class ToString {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",35);
        System.out.println(h1);

    }
}
class Human{
    int age;
    String name;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + " " + age;
    }
}