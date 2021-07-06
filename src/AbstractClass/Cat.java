package AbstractClass;

public class Cat extends Animal{
    @Override
    void doSound() {
        System.out.println("Miay...");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating...");
    }
}
