package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

//В этом коде мы с помощью рефлексии создаем объекты двух классов (наш SomeClass и String  из пакета  java.lang)
// и на объекте класса SomeClass  вызываем его метод передвая в качестве параметра объект класса  String.


public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);//  запускаем сканер

        Class class1 = Class.forName(scanner.next());// считывам первое введенное слово - SomeClass  (имя первого класса)
        Class class2 = Class.forName(scanner.next());// считываем второе введенное слова - java.lang.String (имя второго класа)
        String methodName = scanner.next();// считываем име метода (setName)

        Method m = class1.getMethod(methodName, class2);// создаем объект класса метод (берем его из объекта класса Class, который класс SomeClass)
                                                        //в параметрах будет имя метода (setName и аргумент (класс String))
        Object o1 = class1.newInstance();// создаем объект класса SomeClass

        //создаем объект класса String  в параметры которго передаем наш текст
        Object o2 = class2.getConstructor(String.class).newInstance("Привет из метода объекта первого класса, вызванного из объекта второго класса");

        // вызываем метод invoke который и применяет метод класса SomeClass  на  его объекте, но  с параметром в виде класса  String
        m.invoke(o1,o2);

        System.out.println(o1);
    }
}
