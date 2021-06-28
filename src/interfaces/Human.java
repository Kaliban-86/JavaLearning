package interfaces;

public class Human implements Info {
    String name;

     Human(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println(this.name);
    }
}
