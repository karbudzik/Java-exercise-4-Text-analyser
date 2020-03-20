package application;

import java.util.Iterator;
import java.util.Map;

public class View {
    public static void print(String string) {
        System.out.println("\n " + string);
    }

    public static void print(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); 
        while(iterator.hasNext()) { 
             Map.Entry<String, String> entry = iterator.next(); 
             System.out.println("\n " + entry.getKey() +  " : " + entry.getValue()); 
        } 
    }

    public static void printName(String name) {
        System.out.println("\n ------" + name + "------");
    }
}
    