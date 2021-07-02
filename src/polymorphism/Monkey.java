package polymorphism;

public class Monkey extends Animal{
    String name;
    int age;
    Monkey(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return (name + " " + age);
    }
}
