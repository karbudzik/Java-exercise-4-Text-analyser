package application;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class View {
    public static void print(Number number) {
        System.out.println(number);
    }

    public static void print(String string) {
        System.out.println(string);
    }

    public static void print(List<String> list) {
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void print(Map<String, Integer> map, int number) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator(); 
        
        while(iterator.hasNext()) { 
             Map.Entry<String, Integer> entry = iterator.next(); 
             System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue()); 
        } 
    }
}
    