package interfaces;

public class TestClass {
    public static void main(String[] args) {
        Human h1 = new Human("Bob");
        Animal an1 = new Animal(10);
        h1.showInfo();
        an1.showInfo();

        Info in1 = new Human("Mary");
        Info in2 = new Animal(15);
        in1.showInfo();
        in2.showInfo();

        infoInterf(in1);
        infoInterf(in2);
        infoInterf(h1);
        infoInterf(an1);

    }

    public static void infoInterf(Info in) {
        in.showInfo();
    }
}
