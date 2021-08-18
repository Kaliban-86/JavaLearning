package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPatterAndMancher {
    public static void main(String[] args) {
        String string1 = "My dear mother, send you my new email address - koxanovskij86@mail.ru," +
                " thr email address of my wife is ponarna@rambler.com, kiss you!";

        // создаем объект класса pattern с помощью статичного метода (фактори паттер) и передаем регулярное выражение
        Pattern patternMail = Pattern.compile("(\\w+)@(mail|rambler)\\.(ru|com)");

        Pattern  pattern2 = Pattern.compile(" m(\\w+)r"); //  вот так мы можем найти слово mother

        // создаем объект класса matcher  и применяем метод  matcher, которому передаем нашу строку
            Matcher matcher = patternMail.matcher(string1);

        while (matcher.find()) { // пока находим паттерны выводим в консоль,
            System.out.println(matcher.group());
        }

        matcher.reset();
        // методу  group  можно передавать номер групп
        while (matcher.find())
            System.out.println(matcher.group(1));
    }
}
