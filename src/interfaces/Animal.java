package interfaces;

public class Animal implements Info{
    int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println(this.id);
    }
}
