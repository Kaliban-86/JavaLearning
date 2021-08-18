package Lambda;


interface Exeсutoble {
    void Execute();
}

interface Exeсutoble2 {
    int Execute(); // возвращает значение
}

interface Exeсutoble3 {
    int Execute(int x, int y); // возвращает значение и принимает аргументы
}

class Runner1 {
    public void run(Exeсutoble exekutoble) {
        exekutoble.Execute();
    }
}

class Runner2 {
    public void run(Exeсutoble2 exekutoble2) {
        int value = exekutoble2.Execute();
        System.out.println(value);
    }
}

class Runner3 {
    public void run(Exeсutoble3 exekutoble3) {
        int value = exekutoble3.Execute(7, 35);
        System.out.println(value);
    }
}

class RunnerEx implements Exeсutoble {

    @Override
    public void Execute() {
        System.out.println("Hello, i am execute!!!!");
    }
}

public class TestLambda {

    public static void main(String[] args) {
//***********************************************************************************************//
        Runner1 runner1 = new Runner1();

        //  первый способ (через создание объекта класса реализующего нужный интерфейс)
        runner1.run(new RunnerEx());

        //  второй способ (через анонинмный класс)
        runner1.run(new Exeсutoble() {
            @Override
            public void Execute() {
                System.out.println("Hello, i am execute!!!!");
            }
        });

        //  третий способ (через лямбду)

        runner1.run(() -> System.out.println("Hello, i am execute!!!!"));
//*******************************************************************************************//
        Runner2 runner2 = new Runner2();

        runner2.run(new Exeсutoble2() {
            @Override
            public int Execute() {
                System.out.println("Возврат значения из первого способа (анонимный класс)");
                return 1;
            }
        });

        runner2.run(() -> { // если два действия, то фигурные скобки, если одно, то не надо
            System.out.println("Возврат значения из воторого способа (лямбда)");
            return 2;
        });

        runner2.run(() -> 2);// можно упростить до такого синтаксиса, если не нужно печатать сообщение.
//********************************************************************************************//
        Runner3 runner3 = new Runner3();

        runner3.run(new Exeсutoble3() {
            @Override
            public int Execute(int x, int y) {
                return x + y;
            }
        });

        runner3.run((x,y) -> x + y);//  скобки указываются если есть более одного аргумента, среда предлагает заменить на что-то еще, но это потом изучим

        int a = 100;
        runner3.run((x,y)-> x + y + a);// лямюда имеет доступ к внешним переменным, но только если они не изменяются, что-то вроде final.

    }
}
