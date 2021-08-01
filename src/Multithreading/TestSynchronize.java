package Multithreading;

public class TestSynchronize {
    private int count;

    public static void main(String[] args) throws InterruptedException {
        TestSynchronize testSynchronize = new TestSynchronize();

        testSynchronize.DoRun();


    }

    public void DoRun() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {  // анонимный класс
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    incrementCount();
                }
            }
        });

        Thread thread2 = new Thread(() -> {  // тоже самое, но через лямбду.
            for (int i = 0; i < 1000; i++) {
                incrementCount();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); //  метод для ожидания основным потоком завершения других потоков
        thread2.join();

        System.out.println(count);
    }

    public synchronized void incrementCount() { //  synchronized -  дает возможность использовать тело метода в один момент времени только одому потоку
        count++;
    }
}

