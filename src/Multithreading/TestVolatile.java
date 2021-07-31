package Multithreading;

import java.util.Scanner;

public class TestVolatile {
    public static void main(String[] args) {

        MyNewThread myNewThread = new MyNewThread();

        myNewThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myNewThread.stopRun();

    }
}

class MyNewThread extends Thread {
    private volatile boolean bool = true; // volatile не позволяет переменной попасть в кэш во избежание когерентности кэша

    @Override
    public void run() {
        while (bool) {
            try {

                System.out.println("Действие метода Run из потока MyNewThread");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopRun() {
        bool = false;
        System.out.println("Упс!!!!");
    }
}