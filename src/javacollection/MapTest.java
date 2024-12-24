package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {

        //subject  - marks
//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Nepali",80);
        map.put("English", 90);
        map.put("Math",75);
        map.put("Computer",95);
        map.put("Social",70);

        for(String key :map.keySet()){ //map.keySet le key haru dinxa like: english nepali social

            System.out.println(key+" = "+map.get(key));
        }
    }
}
