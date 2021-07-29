package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Iterator<Integer> integerIterator = arrayList.iterator();

        int count = 0;

        while (integerIterator.hasNext()) {  //  отличие от foreach в том, что с элементами можно производить манияпуляции во время итерации.
            System.out.println(integerIterator.next());
            if (count == 0) {
                integerIterator.remove();
            }
            count++;
        }
        System.out.println(arrayList);

        List<AnyClass> anyClassList = new ArrayList<>();

        anyClassList.add(new AnyClass(35, "Vadim"));
        anyClassList.add(new AnyClass(30, "Tom"));
        anyClassList.add(new AnyClass(25, "Saran"));

        Iterator<AnyClass> anyClassIterator = anyClassList.iterator();

        int count2 = 0;
        while (anyClassIterator.hasNext()) { // можно менять объекты во время итерации, интресная вещь!!!!!!
            System.out.println(anyClassIterator.next());
            if (count2 == 1) {
                anyClassList.get(count2).setName("Sam");
                anyClassList.get(count2).setId(77);
            }
            count2++;
        }

        System.out.println(anyClassList);
    }

}

class AnyClass {
    int id;
    String name;

    public AnyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}