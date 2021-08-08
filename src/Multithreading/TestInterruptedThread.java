package Multithreading;

import java.util.Random;

public class TestInterruptedThread {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()){ //  в этом месте мы отрабатываем прерывание сигнал о котором поступил из основного потока
                        System.out.println("Thread was interrupted!!!!");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });

        System.out.println("The thread is starting...");
        thread.start();

        Thread.sleep(2000);
        thread.interrupt(); // вот здесь даем команду на прерывание
        thread.join();
        System.out.println("The thread is finished!");
    }
}
