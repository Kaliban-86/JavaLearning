package Multithreading;

public class TestCreateThreads {
    public static void main(String[] args) throws InterruptedException {

        // первый способ создания потоков
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start(); // для запуска выполняется метод  start
        myThread2.start();

        Thread.sleep(1000);// команда постановки на паузу


        // второй способ создания потока
        Thread myThread3 = new Thread(new RunThread());
        myThread3.start();
    }
}

// первый способ создания потоков
class MyThread extends Thread {
    @Override
    public void run() { // здесь происходит действие выполняемое в потоке
        for (int i = 0; i < 500; i++) {
            System.out.println("Действие номер " + i);
        }
    }
}

// второй способ создания потока
class RunThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Действие номер " + i + " но из другого потока)");
        }
    }
}