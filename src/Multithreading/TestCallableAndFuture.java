package Multithreading;

import java.util.Random;
import java.util.concurrent.*;

public class TestCallableAndFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(new Callable<Integer>() { // создаем объект класса future  для возвращения значения
                                                                                // и передаем не Runnable  а Callable, параметризованный.
            @Override
            public Integer call() throws Exception {
                Random random = new Random();

                int value = random.nextInt(100);

                if(value>10){
                    throw new Exception("Something bad!!!!");
                }
                return value;
            }
        });

        executorService.shutdown();

        try {
            int num = future.get();
            System.out.println(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable throwable = e.getCause();
            System.out.println(throwable.getMessage());
            e.printStackTrace();
        }
    }
}
