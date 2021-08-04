package Multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestProducerAndConsumerHandmade {
    public static void main(String[] args) throws InterruptedException {
        ProduceAndConsum produceAndConsum = new ProduceAndConsum();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produceAndConsum.produce();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                produceAndConsum.consume();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


    }
}

class ProduceAndConsum {
    Queue<Integer> integerQueue = new LinkedList<>();
    public final int SIZE = 10;
    Object lock = new Object();

    public void produce() {
        int num = 0;
        while (true) {
            synchronized (lock) {
                while (integerQueue.size() == SIZE) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                integerQueue.add(num++);
                System.out.println("В очередь добавлено число: " + num);

                System.out.println("после добавления размер очереди равен: " + integerQueue.size());
                lock.notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (lock) {
                while (integerQueue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("из очереди удалено число: " + integerQueue.remove());
                System.out.println("после удаления размер очереди равен: " + integerQueue.size());

                lock.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}