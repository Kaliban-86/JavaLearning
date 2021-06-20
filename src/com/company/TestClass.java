package com.company;

public class TestClass {
    int age;
    String name;

    public TestClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void testFun() {
        System.out.println("Его зовут " + name + " и ему " + age + " лет!");
    }
}
