package JavaCollectionFramework;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Boy> boysTeam = new LinkedList<>();
        Queue<Boy> boysTeam2 = new ArrayBlockingQueue<>(5); // нужно указать размер очереди

        addToCollection(boysTeam);
        System.out.println(boysTeam);

        System.out.println(boysTeam.remove()); //  первым происходит удаление элемента, котрый был добавлен первым в очередь - FIFO
        System.out.println(boysTeam.peek());  //   первым происходит отображение элемента, котрый был добавлен первым в очередь - FIFO

        addToCollection(boysTeam2);
        System.out.println(boysTeam2);
        System.out.println(boysTeam2.offer(new Boy("Misha"))); // выдаст специальное значение вместо ошибки
        System.out.println(boysTeam2.add(new Boy("Saran"))); // выдаст ошибку

    }
    public static void addToCollection (Collection<Boy> collection){
        collection.add(new Boy("Vadim"));
        collection.add(new Boy("Tom"));
        collection.add(new Boy("Sam"));
        collection.add(new Boy("Ivan"));
        collection.add(new Boy("Ruslan"));
    }

}
class Boy{
    String name;

    public Boy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                '}';
    }
}