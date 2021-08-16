package Regex;

public class TestRegex {
    public static void main(String[] args) {

        /*
        \\d -  одна цифра
        \\w - одна буква
        + - один или более
        * - ноль или более
        ? - 0 или 1 символов до
        {2} - количество букв или цифр в этом случа 2
        {2, } - тоже самое только от 2-х
        {2,7 } - тоже самое только от 2-х до 7
        [a-zA-Z] = (a|b|c|d|i|f|g|итд) почти как или, но есть приимущества
        . - любой символ
         */

        String s1 = "1234";
        String s2 = "Hello";
        String s3 = "";
        String s4 = "Hi";
        String s5 = "-789879879";
        String s6 = "+789879879";
        String s7 = "asfasf789798798";
        String s8 = "http:www.google.com";
        String s9 = "http:www.yandex.ru";

        System.out.println(s1.matches("1234")); // прост сравнение
        System.out.println(s1.matches("\\d+")); // одна или более цифр
        System.out.println(s5.matches("(-|\\+)?\\d+")); // одна или более цифр перед которыми стоит - или +
        System.out.println(s6.matches("(-|\\+)?\\d+")); // одна или более цифр перед которыми стоит - или +
        System.out.println(s2.matches("\\w+")); // одна или более букв
        System.out.println(s3.matches("\\w+")); // результат бужет false потому,что нет букв
        System.out.println(s3.matches("\\w*")); // ноль или более букв
        System.out.println(s4.matches("\\w{1,8}")); //  от 1 до 8 букв
        System.out.println(s4.matches("\\w{1,8}")); //  от 1 до 8 букв
        System.out.println(s7.matches("[a-z]+\\d+")); // от 1 и более мальньких букв, затем от 1 и более цифр
        System.out.println(s8.matches("http:www\\..+\\.(com|ru)")); // вот здесь фактически создан паттерн email  адреса
        System.out.println(s9.matches("http:www\\..+\\.(com|ru)"));
    }
}
