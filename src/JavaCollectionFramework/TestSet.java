package JavaCollectionFramework;

import java.sql.Array;
import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashSet.add("Tom");
        hashSet.add("Tamara");
        hashSet.add("Sam");
        hashSet.add("Bill");
        hashSet.add("Max");
        hashSet.add("Tom"); // повторение
        hashSet.add("Bill"); // повторение

        System.out.println(hashSet); // повторение не выведется
        System.out.println(hashSet.contains("Tom")); // показывает есть ли элемент во множестве
        System.out.println(hashSet.contains("Den"));
        System.out.println(hashSet.hashCode()); // показывает хэшкод

        Object[] stringArr =  hashSet.toArray(); // возвращает все индивидуальные значения множества в массив.
        System.out.println(Arrays.toString(stringArr));


        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);
        hashSet1.add(6);
        hashSet1.add(7);

        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);
        hashSet2.add(8);
        hashSet2.add(9);
        hashSet2.add(10);


        // union -  объединение множеств

        Set<Integer> unionSet = new HashSet<>(hashSet1);
        unionSet.addAll(hashSet2);
        System.out.println(unionSet);

        // intersection -  пересечение множеств
        Set<Integer> intersectionSet = new HashSet<>(hashSet1);
        intersectionSet.retainAll(hashSet2); // сохраняет все общие элементы
        System.out.println(intersectionSet);

        // difference -  разность множеств

        Set<Integer> differenceSet = new HashSet<>(hashSet1);
        differenceSet.removeAll(hashSet2);
        System.out.println(differenceSet);


    }
}
