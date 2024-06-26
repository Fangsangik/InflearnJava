package chap39.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("studentA" , 90);
        studentMap.put("studentB" , 80);
        studentMap.put("studentC" , 80);
        studentMap.put("studentD" , 100);
        System.out.println("studentMap = " + studentMap);

        Integer rst = studentMap.get("studentD");
        System.out.println("rst = " + rst);

        System.out.println("KeySet 활용");
        Set<String> keySet = studentMap.keySet();
        //key를 반환 (Set) 자료구조로 반환
        //순서를 보장X, 중복X -> Set 자료구조 형태
        for (String key : keySet) {
            Integer val = studentMap.get(key);
            System.out.println("key = " + key + "val = " + val);
        }

        System.out.println("Values 활용");
        //중복이 될 수 있기 때문에 Collection
        //List로 나오지는 않는다. (순서를 보장 X)
        Collection<Integer> values = studentMap.values(); // collection을 반환
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        System.out.println("entrySet 활용");
        //Key값, Value을 묶어서 활용
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }

    }
}
