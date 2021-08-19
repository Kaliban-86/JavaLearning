package Lambda.speshialMethods;

import java.util.*;
import java.util.stream.Collectors;

public class TestSpecialMethods {
    public static void main(String[] args) {
        //******************* метод .map *************************************
        List<Integer> list = new ArrayList<>();
        int[] array = new int[10];

        fill(array, list); //  заполняем массив и коллекцию
        printResult(array, list);// выводим результат

        // передаем в метод stream метод map, в который в качетве аргументов подаем лямда выражения,
        // затем возвращаем преобразовав в массив через метод toArray
        // метод .map делает что-то с каждым элементом массива (что-то, это то, что мы пропишем в лямбде)
        array = Arrays.stream(array).map(a -> a + 2).toArray();

        list = list.stream().map(a -> a * 2).collect(Collectors.toList());

        printResult(array, list);// выводим результат

        //******************* метод .filter *************************************

        List<Integer> list1 = new ArrayList<>();
        int[] array1 = new int[10];

        fill(array1, list1);
        printResult(array, list);

        //  метод filter  фильтрует по каким либо признакам (что мы и указываем в лямда функции)
        array1 = Arrays.stream(array1).filter(a -> (a % 2 == 0)).toArray();
        list1 = list1.stream().filter(a -> (a % 3 == 0)).collect(Collectors.toList());
        printResult(array1, list1);

        //******************* метод forEach *************************************

        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fill(array2, list2);
        printResult(array2, list2);

        Arrays.stream(array2).forEach((a) -> System.out.println(a));
        list2.forEach(System.out::println);// среда разработки предлагает так)))

//******************* метод reduce *************************************
        int[] array3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fill(array3, list3);
        printResult(array3, list3);

        int x = Arrays.stream(array3).reduce((acc, a) -> acc + a).getAsInt();// объединение всех значений в одно, можно указать начальное значение переменной acc
        int y = list3.stream().reduce((acc, a) -> acc * a).get();

        System.out.println(x);
        System.out.println(y);

        //**** можно использовать сразу несколько методов************

        int[] arr4 = new int[10];

        fill(arr4, list3);

        arr4 = Arrays.stream(arr4).filter(a -> a % 2 == 0).map(a -> a + 10).toArray();// используем сразу два метода последовательно

        System.out.println(Arrays.toString(arr4));


        //****** можно использовать на других типах коллекций********8888

        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(9);
        set.add(8);
        set.add(7);
        set.add(6);

        System.out.println(set);

        set = set.stream().map(a -> a + 1000).collect(Collectors.toSet());

        System.out.println(set);

    }

    private static void fill(int[] array, List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }

    public static void printResult(int[] arr, List<Integer> list) {
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
