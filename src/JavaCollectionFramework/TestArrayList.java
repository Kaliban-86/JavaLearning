package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        arrayList.remove(4);

        System.out.println(arrayList);
        System.out.println(arrayList.get(4));

        arrayList.add(4,4);
        System.out.println(arrayList);

        arrayList.set(7,77);
        System.out.println(arrayList);
    }
}
