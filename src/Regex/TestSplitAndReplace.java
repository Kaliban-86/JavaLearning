package Regex;

import java.util.Arrays;

public class TestSplitAndReplace {
    public static void main(String[] args) {
        String s1 = "Hello new world";
        String s2 = "Hello1232new12331321world";
        String s4 = "Mama";

        String[] stringArray1 = s1.split(" ");// разделение по пробелам с помощью метода split  и запись в массив
        String[] stringArray2 = s2.split("\\d+");// разделение с помощью регулярного выражения и запись в массив


        System.out.println(Arrays.toString(stringArray1));
        System.out.println(Arrays.toString(stringArray2));

       String s3 = s2.replaceAll("\\d+", "-");// замена с помощью метода replace
        System.out.println(s3);

        s4 = s4.replaceAll("([Mm])","p");

        System.out.println(s4);

    }
}
