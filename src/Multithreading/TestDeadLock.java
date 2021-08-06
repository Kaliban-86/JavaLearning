package Multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestDeadLock {
    public static void main(String[] args) throws InterruptedException {
        DoSomething doSomething = new DoSomething();

        Thread thread1 = new Thread(doSomething::firstThreadDo);
        Thread thread2 = new Thread(doSomething::secondThreadDo);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        doSomething.finishDo();

    }
}

class DoSomething {

    Account account1 = new Account();
    Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1, Lock lock2) { // метод позволяющий избекать deadLock
        boolean lock1Status = false;
        boolean lock2Status = false;

        while (true) {

            try {
                lock1Status = lock1.tryLock();
                lock2Status = lock2.tryLock();
            } finally {
                if (lock1Status && lock2Status) {
                    return;
                }
                if (lock1Status) {
                    lock1.unlock();
                }
                if (lock2Status) {
                    lock2.unlock();
                }
            }

        }
    }

    public void firstThreadDo() {
        Random random = new Random();
        // если порядок заквата lock в разных потоках разный, то может наступить deadLock
        // состояние при которм потоки находся как бы в состоянии ожидания и программа зависнет
        for (int i = 0; i < 100; i++) {
            //lock1.lock(); // так как для работы метола необходимо два объекта, то требуется захват обоих мониторов этих объектов
            //lock2.lock(); // поэтому и испольхуется два Lock

            takeLocks(lock1, lock2);

            try {
                Account.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock(); // обязательно в блоке finally, потому что код в блоке try может зависнуть и тогда не снимется lock.
                lock2.unlock();
            }
        }
    }

    public void secondThreadDo() {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            // lock1.lock();
            //lock2.lock();

            takeLocks(lock2, lock1);
            try {
                Account.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finishDo() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("На двух счетах - " + (account1.getBalance() + account2.getBalance()));
    }
}

class Account {

    private Account account1;
    private Account account2;

    private int balance = 10000;

    public void topUpAccount(int amountOfMoney) {
        balance += amountOfMoney;
    }

    public void withdraw(int amountOfMoney) {
        balance -= amountOfMoney;
    }

    public static void transfer(Account account1, Account account2, int amountOfMoney) {
        account2.withdraw(amountOfMoney);
        account1.topUpAccount(amountOfMoney);
    }

    public int getBalance() {
        return balance;
    }
}
