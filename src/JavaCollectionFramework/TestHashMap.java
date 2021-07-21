package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"Вадим");
        hashMap.put(2,"Женя");
        hashMap.put(3,"Руслан");

        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.size());
        System.out.println(hashMap.values());
        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsValue("Женя"));
        System.out.println(hashMap.entrySet());

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        class SomeClass{
            int value;
            SomeClass (int value){
                this.value = value;
            }
            public String toString(){
                String x;
                x = " it is " + value;
                return x;
            }
        }

        Map<Integer,SomeClass> hashMap1 = new HashMap<>();

        hashMap1.put(1,new SomeClass(30));
        hashMap1.put(2,new SomeClass(35));
        hashMap1.put(3,new SomeClass(40));

        System.out.println(hashMap1.values());
        System.out.println(hashMap1.get(2));
    }
}
