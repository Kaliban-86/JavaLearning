package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static  void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Frog");
        animals.add("Cat");
        animals.add("Shake");
        animals.add("Monkey");
        animals.add("be");
        animals.add("D");

        System.out.println(animals); // без сортировки, порядок добавления

        Collections.sort(animals);
        System.out.println(animals);//  после сортировки, лексикографический порядок

        Collections.sort(animals, new Comparator<String>() { // анонимный класс

            @Override
            public int compare(String o1, String o2) { // сравнение по длине слова
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else return 0;
            }
        });

        System.out.println(animals); //  после сортировки по длине слова


        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(2);
        numbers.add(32);
        numbers.add(120);
        numbers.add(1);
        numbers.add(14);
        numbers.add(6);
        numbers.add(1221);
        numbers.add(0);

        System.out.println(numbers); // без сортировки

        Collections.sort(numbers);
        System.out.println(numbers); // после сортировки нормальным порядком


        Collections.sort(numbers, (o1, o2) -> { //после сортировки от большего к меньшему (синтаксис с использованием лямбда выражения)
            if (o1 > o2) {
                return -1;
            } else if (o1 < o2) {
                return 1;
            } else return 0;
        });
        System.out.println(numbers);

        List<Cars> automobilse = new ArrayList<>();

        automobilse.add(new Cars(35, "Ford"));
        automobilse.add(new Cars(7, "Toyota"));
        automobilse.add(new Cars(14, "Genesis"));
        automobilse.add(new Cars(777, "Reno"));
        automobilse.add(new Cars(99, "RangeRover"));

        System.out.println(automobilse);

        Collections.sort(automobilse, new Comparator<Cars>() { // сортровка по длине поля model
            @Override
            public int compare(Cars o1, Cars o2) {
                if (o1.model.length() > o2.model.length()) {
                    return 1;
                } else if (o1.model.length() < o2.model.length()) {
                    return -1;
                } else return 0;
            }
        });

        System.out.println(automobilse);

        Collections.sort(automobilse, (o1, o2) -> { // сортировка по нарастанию значения поля id (синтаксис с лямбда выражением)
            if (o1.id > o2.id) {
                return 1;
            } else if (o1.id < o2.id) {
                return -1;
            } else return 0;
        });

        System.out.println(automobilse);
    }
}

class Cars {
    int id;
    String model;

    public Cars(int id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}