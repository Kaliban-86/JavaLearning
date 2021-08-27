package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {

        Class classClass = SomeClass.class; // создаем объект класса Class,
        // в котором используем наш класс SommeClass  как простой объект класса Class

        SomeClass someClass = new SomeClass();
        Class classClass1 =  someClass.getClass(); //  воторой способ создания объекта класса class  из объекта  класса SomeClass

        Method[] methods = classClass.getMethods(); // получаем массив методов из нашего объекта
        Field[] fields = classClass1.getDeclaredFields(); // получаем массив полей класса SomeClass


        for (Method x : methods) {
            System.out.println(x.getName() + " " + x.getGenericReturnType()); // выводим в консоль название метода и тип возвращаемого значения
        }

        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }
}
