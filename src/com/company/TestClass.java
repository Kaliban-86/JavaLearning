package com.company;

public class TestClass {
    int age;
    boolean bool;
    char ch;
    float fl;
    double db;
    byte bt;
    long lng;

    String name;

    public TestClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void testFun() {
        System.out.println("Его зовут " + name + " и ему " + age + " лет!");
    }
}
