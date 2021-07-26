package JavaCollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestLinkedMapAndTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        testMaps(hashMap);// вывод в случайном порядке, порядок не гарантируется
        System.out.println("*******************");
        testMaps(linkedHashMap); // вывод в порядке в котором были добавлены пары ключ значение
        System.out.println("*******************");
        testMaps(treeMap); //вывод в порядке сортировки

    }

    public static void testMaps (Map<Integer,String> map){
        map.put(15,"Tom");
        map.put(100,"Sam");
        map.put(1,"Bob");
        map.put(31,"Barbara");
        map.put(7,"Samra");
        map.put(0,"Tamara");

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
