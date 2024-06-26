package chap39.practice;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> rst = new HashMap<>();

        for (String key1 : map.keySet()) {
            if (map2.containsKey(key1)){
                rst.put(key1, map.get(key1) + map2.get(key1));
            }
        }

        System.out.println("rst = " + rst);
    }
}
