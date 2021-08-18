package Lambda;


interface Exekutoble {
    void Execute();
}

interface Exekutoble2 {
    int Execute(); // возвращает значение
}

class Runner1 {
    public void run(Exekutoble exekutoble) {
        exekutoble.Execute();
    }
}

class Runner2 {
    public void run(Exekutoble2 exekutoble2) {
        int value = exekutoble2.Execute();
        System.out.println(value);
    }
}

class RunnerEx implements Exekutoble {

    @Override
    public void Execute() {
        System.out.println("Hello, i am execute!!!!");
    }
}

public class TestLambda {

    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();

        //  первый способ (через создание объекта класса реализующего нужный интерфейс)
        runner1.run(new RunnerEx());

        //  второй способ (через анонинмный класс)
        runner1.run(new Exekutoble() {
            @Override
            public void Execute() {
                System.out.println("Hello, i am execute!!!!");
            }
        });

        //  третий способ (через лямбду)

        runner1.run(() -> System.out.println("Hello, i am execute!!!!"));

        Runner2 runner2 = new Runner2();

        runner2.run(new Exekutoble2() {
            @Override
            public int Execute() {
                System.out.println("Вохврат значения из первого способа (анонимный класс)");
                return 1;
            }
        });

        runner2.run(() -> {
            System.out.println("Возврат значения из воторого способа (лямбда)");
            return 2;
        });

    }
}
