package wildcards;

public class Animal {
    String name;

    Animal() {

    }

    Animal(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println("Animal is eating...");
    }

    @Override
    public String toString() {
        return name;
    }
}
