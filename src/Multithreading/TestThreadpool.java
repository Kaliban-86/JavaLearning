package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThreadpool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // это и есть ThreadPool

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Work(i)); // передача потокам threadPool заданий
        }

        executorService.shutdown(); // завершение передачи заданий
        System.out.println("Задачи потокам розданы!!!!");
        executorService.awaitTermination(1, TimeUnit.DAYS); // основной поток остановлен в ожидании выполнения потоков threadPool

    }
}

class Work implements Runnable {
    int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Задача номер " + id + " выполнена!");
    }
}