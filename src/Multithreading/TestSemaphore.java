package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class TestSemaphore {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(50);

        Connection connection = Connection.getConnection(); // вызываем абстрактный метод на классе, возвращающий единственный объект синглтон!!!!

        for (int i = 0; i < 50; i++) {
            executorService.submit(connection::workForThreads);
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Connection {
    private static Connection connection = new Connection();
    private int connectioncount;
    Semaphore semaphore = new Semaphore(10); // создаем объект класса semaphore, который разрешает аработу только 10 потокам.

    private Connection() { // приватный конструктор, не позволяет создавать объекты этого класса паттерн - Singleton
    }

    public static Connection getConnection() {
        return connection;
    }

    public void workForThreads() {
        try {
            semaphore.acquire(); //  в этом месте мы забираем разрешения
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doWork();
        semaphore.release();// в этом месте мы отдаем разрешения
    }

    private void doWork() {

        synchronized (this) {
            connectioncount++;
            System.out.println(connectioncount);

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connectioncount--;
        }
    }
}