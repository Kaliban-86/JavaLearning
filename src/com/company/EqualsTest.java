package com.company;

public class EqualsTest {
    public static void main(String[] args) {
        Frog frog = new Frog("Bob");
        Frog frog1 = new Frog("Bob");

        System.out.println(frog.equals(frog1));

    }
}

class Frog {
    String name;

    Frog(String name) {
        this.name = name;
    }

    public boolean equals(Frog frg) { //  переопределяем метод equals в котором указываем, что же конкретно сравнивать.
        //Frog someFrog = (Frog) object; видимо в последних версиях джава можно не даункастить...
        return this.name.equals(frg.name);

    }

}