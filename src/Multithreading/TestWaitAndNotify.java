package Multithreading;

import java.util.Scanner;

public class TestWaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotify.waitTest();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.notifyTest();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


    }
}

class WaitAndNotify{
            long time = 2000;
    public void waitTest(){
        synchronized (this){
        System.out.println("Место в коде до запуска метода wait()");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Место в коде после возвращения в первый поток, туда где ранее был запущен метод wait()");
        }
    }

    public void notifyTest() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this){
            System.out.println("место в коде до запуска метода notift(), ждем нажатия кнопки Enter");
            scanner.nextLine();
            notify();
            System.out.println("Метсо в коде после запуска метода notify");
            System.out.println("Ожидание " + time + " миллисекунд");
            Thread.sleep(time);
        }
    }
}