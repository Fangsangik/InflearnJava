package chap39.practice;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        Map<String, Integer> rst = new HashMap<>();

        for (String key1 : map.keySet()) {
            if (map2.containsKey(key1)){
                rst.put(key1, map.get(key1) + map2.get(key1));
            }
        }

        System.out.println("rst = " + rst);
    }
}
