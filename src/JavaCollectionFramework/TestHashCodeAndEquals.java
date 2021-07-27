package JavaCollectionFramework;

import java.util.*;

public class TestHashCodeAndEquals {
    public static void main(String[] args) {
        Map<Person, String> hashMap = new HashMap<>();
        Set<Person> hashSet = new HashSet<>();

        Person person1 = new Person(35,"Tom");
        Person person2 = new Person(35,"Tom");
        Person person3 = new Person(15,"Sam");

        hashMap.put(person1,"Any1");
        hashMap.put(person2,"Any2"); //если не переопределить метод equals то разные объекты с одинаклвыми значениями могут быть ключами
        hashMap.put(person3,"Any3");
        System.out.println(hashMap);

        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person1);
        System.out.println(hashSet);



    }
}
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) { // переопределение метода позводяет сравнивать объекты по значениям их полей
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}