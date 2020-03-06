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

    public static void print(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); 
        
        while(iterator.hasNext()) { 
             Map.Entry<String, String> entry = iterator.next(); 
             System.out.println(entry.getKey() +  " : " + entry.getValue()); 
        } 
    }

    public static void printName(String name) {
        System.out.println("---" + name + "---");
    }
}
// wywalić niepotrzebne
    