package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestSynchronizePartTwo {
    public static void main(String[] args) {

        new Worker().main();
    }
}

class Worker {
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    Random random = new Random();

    final Object lock1 = new Object(); // создаем объекты для синхронизации,это может быть любой объект, но правило хорошего тона создавать отдельный объект
    final Object lock2 = new Object();

    public void addTolistOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addTolistTwo() {
        synchronized (lock2) { // вот здесь, в блоке синхронизации и происходит синхронизация на мониторе объекта lock2
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addTolistOne();
            addTolistTwo();
        }
    }

    public void main() {
        long after = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long before = System.currentTimeMillis();

        System.out.println("Время работы программы составило " + (before - after) + " миллисекунд");

        System.out.println(list1.size());
        System.out.println(list2.size());

    }
}