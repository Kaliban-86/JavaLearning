package AnonymClass;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal() {   //  вот здесь в коде фактически и создается анонимный класс дочерний от класса Animal
            void eat() {
                System.out.println("SomeAnimal1 is eating...");
            }
        };

        Animal animal2 = new Animal();

        animal1.eat();
        animal2.eat();

        MayBark mayBark = new MayBark() { // вот здесь реализован анонимный класс для реализации метода интерфейса
            @Override
            public void bark() {
                System.out.println("Гав гав...");
            }
        };

        mayBark.bark();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}


interface MayBark {
    void bark();
}