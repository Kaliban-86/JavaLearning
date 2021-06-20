package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = setCToFunSetting(a,b);
        System.out.println("С = " + c);
        System.out.println("Ура товарищи!!!!!");

    }

    public  static int setCToFunSetting(int a, int b) {
        int c;
        if (a > b) {
            c = 100;
        } else c = 500;
        return c;
    }

}
