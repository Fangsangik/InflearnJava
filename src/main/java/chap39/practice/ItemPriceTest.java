package chap39.practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("사과", 500, "바나나", 500, "망고", 1000, "딸기", 1000);

        List<String> rst=  new ArrayList<>();
        for (Map.Entry<String, Integer> key : map.entrySet()) {
            if (key.getValue().equals(1000)){
                rst.add(key.getKey());
            }
        }

        System.out.println(rst);
    }
}
