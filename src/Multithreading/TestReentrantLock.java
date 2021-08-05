package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {
    public static void main(String[] args) throws InterruptedException {

        Task task = new Task();

        Thread thread1 = new Thread(task::firstThread);// что-то новое предложила среда разработки вместо лямбды)))
        Thread thread2 = new Thread(() -> task.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(task.count);
    }
}

class Task{

    public Lock lock = new ReentrantLock(); // создаем объет класса ReentrantLock

    int count;

    private void increment(){
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }
    public void firstThread(){
        lock.lock(); // пока вызван метод lock()  и не вызван метод unlock() другие потоки не могут использовать метод
        increment();
        lock.unlock();
    }

    public void secondThread(){
        lock.lock();
        increment();
        lock.unlock();
    }
}