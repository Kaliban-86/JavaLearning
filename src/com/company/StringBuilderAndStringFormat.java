package com.company;

public class StringBuilderAndStringFormat {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        System.out.println(stringBuilder1.toString());
        stringBuilder1.append(" world").append(" !!!");
        System.out.println(stringBuilder1.toString());

        StringBuilder stringBuilder2 = new StringBuilder("Привет мир!!!");
        System.out.println(stringBuilder2.toString());
        System.out.printf("Привет из %s строк № %d \n","форматирования", 35);
        System.out.printf("Устанавливаем количество символов до 10 - %5d\n", 35);
        System.out.printf("Устанавливаем количество символов до 10 - %-5d", 35);
    }
}
