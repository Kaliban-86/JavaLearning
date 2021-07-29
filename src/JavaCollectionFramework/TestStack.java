package JavaCollectionFramework;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack.peek()); //  показывает последний добавленный элемент - LIFO

        while (!integerStack.empty())
        System.out.println(integerStack.pop()); // удаляет элементы начиная с конца - LIFO
    }
}
