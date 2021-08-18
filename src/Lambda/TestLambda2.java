package Lambda;

import java.util.ArrayList;
import java.util.List;

public class TestLambda2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Папа");
        list.add("Сын");
        list.add("Дочка");
        list.add("Он");
        list.add("Мамочка");
        list.add("Я");

        System.out.println(list);

        list.sort((s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else return 0;
        });
        System.out.println(list);
    }
}
