package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        measureTime(arrayList);// если просто добавить, то быстрее, если сначала массива,то медленнее, если считать, то быстрее
        measureTime(linkedList);// если просто добавить, то медленнее, если сначала массива, то быстрее, если считать, то медленнее

    }

    public static void measureTime(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        Long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }

        Long and = System.currentTimeMillis();

        System.out.println(and - start);
    }
}
