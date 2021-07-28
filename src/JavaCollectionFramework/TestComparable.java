package JavaCollectionFramework;

import java.util.*;

public class TestComparable {
    public static void main(String[] args) {


        Set<Girls> girlsTeam1 = new TreeSet<>();
        List<Girls> girlsTeam2 = new ArrayList<>();

        addToCollection(girlsTeam1);
        System.out.println(girlsTeam1);

        addToCollection(girlsTeam2);
        System.out.println(girlsTeam2);
        Collections.sort(girlsTeam2);
        System.out.println(girlsTeam2);

    }

    public static void addToCollection(Collection<Girls> collection) {
        collection.add(new Girls(2, "Ley"));
        collection.add(new Girls(1, "Sofi"));
        collection.add(new Girls(4, "Li"));
        collection.add(new Girls(3, "Tamara"));
        collection.add(new Girls(5, "Laura"));
    }
}

class Girls implements Comparable<Girls> { //обязательно указать параметр, в нашем случае Girls
    private int size;
    private String name;

    public Girls(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girls girls = (Girls) o;
        return size == girls.size && Objects.equals(name, girls.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

    @Override
    public String toString() {
        return "Girls{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Girls o) { // здесь задаем правила сортировки по умолчанию или как говорится нормальный порядок
        if (this.getSize() > o.getSize()) {
            return 1;
        } else if (this.getSize() < o.getSize()) {
            return -1;
        } else return 0;
    }
}