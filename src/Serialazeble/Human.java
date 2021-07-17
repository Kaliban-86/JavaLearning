package Serialazeble;

import java.io.Serializable;

public class Human implements Serializable {
    private int age;
    private String name;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }

}
