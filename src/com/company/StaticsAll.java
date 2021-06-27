package com.company;

public class StaticsAll {
    public static void main(String[] args) {
        TestingStatic.value = 35;
        TestingStatic.testMethod(TestingStatic.value);

        TestingStatic test1 = new TestingStatic();
        TestingStatic test2 = new TestingStatic();
        TestingStatic test3 = new TestingStatic();
        TestingStatic test4 = new TestingStatic();

    }
}

class TestingStatic {
    public static int value;
    public static int count;

    TestingStatic() {
        count++;
        System.out.println("Создан " + count + " экземпляр класса TestingStatic");
    }

    public static void testMethod(int staticValue) {
        System.out.println("Пример статического метода и статической перемнной: " + staticValue);
    }
}