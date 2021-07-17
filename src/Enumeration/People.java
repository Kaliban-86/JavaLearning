package Enumeration;

public enum People {
    TOM(15), BOB(20), SAM(25), TAMARA(35);

    private int age;

    People(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "Возраст составляет " + age;
    }
}
