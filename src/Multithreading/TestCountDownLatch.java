package Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5); // создаем "защелку" на 5 обратных отщелкиваний
        ExecutorService executorService = Executors.newFixedThreadPool(5); // создаем пул потоков на 5 потоков

        for (int i = 0; i < 5; i++) { // раздаем в цикле 5 поптокам 5 заданий
            executorService.submit(new Worker2(i, countDownLatch));
        }
        executorService.shutdown();// говорим от том, что задания розданы, нужно начать их отработку
        System.out.println("Запускаем метод await");
        countDownLatch.await();// запускаем метод который не пускает онсовной поток дальше пока защелки не отработают
        System.out.println("Все защелки открыты!!!");



    }
}

class Worker2 implements Runnable {
    private int id;
    private CountDownLatch countDownLatch;

    public Worker2(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Thread number " + id + " finish work with countDownLatch");
        countDownLatch.countDown();
    }
}