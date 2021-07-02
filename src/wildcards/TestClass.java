package wildcards;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Tom"));
        animals.add(new Animal("Bob"));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        show(animals);
       // show(dogs); //  уже не прокатываетя, хотя мы знаем, что это дочерний класс и по идее по законам полиморфизма должно работать
        show2(animals);
        show2(dogs);

    }

    public static void show(List<Animal> animals){
        for (Animal animal : animals){
            System.out.println(animal);
        }
    }
            //  wildcards  это <? extends каккой-то класс> обозначает что можно использовать класс от родителя и ниже
    public static void show2(List<? extends Animal> animals){
        for (Animal animal : animals){
            animal.eat();
        }
    }
}
