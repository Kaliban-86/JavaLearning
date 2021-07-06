package AbstractClass;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.doSound();

        cat.eat();
        cat.doSound();
    }
}
