package com.company;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");

        Any any = new Any();

        animals.add(any);

        String animal = (String) animals.get(1); // используем нисходящее преобразование из обжект до стринг
        System.out.println(animal);

        List<String> animals2 = new ArrayList<>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");

        String animal2 = animals2.get(2);
        System.out.println(animal2);

    }
}

class Any{

}