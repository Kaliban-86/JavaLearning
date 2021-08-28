package Reflection;


public class SomeClass {
     long x = 5;
     String name;


    public long getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "x=" + x +
                ", name='" + name + '\'' +
                '}';
    }
}
