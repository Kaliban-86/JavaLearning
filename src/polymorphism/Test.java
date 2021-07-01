package polymorphism;

import com.company.TestClass; // импорт класса из другого пакета

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Dog(); // Восходящее преобразование
        Animal animal2 = new Cat();

        Dog dog1 = (Dog) animal1; // Нисходящее преобразование




       TestClass ts = new TestClass(12,"dfdf"); // демонстрация импорта из другого пакета

        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eat();
        animal1.eat();
        animal2.eat();
        dog.eat();
        cat.eat();

        run(animal);
        run(animal1);
        run(animal2);

        run(dog);
        run(cat);




    }

    public static void run (Animal animal){
        animal.run();
    }
}
