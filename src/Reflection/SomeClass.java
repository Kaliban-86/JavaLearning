package Reflection;

@SomeAnnot
public class SomeClass {
    @SomeAnnot long x;
    @SomeAnnot String name;

    @SomeAnnot
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

}
