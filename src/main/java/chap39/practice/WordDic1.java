package chap39.practice;

import java.util.HashMap;
import java.util.Map;

public class WordDic1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] str = text.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String key : str) {
            map.put(key, map.getOrDefault(key, 0) + 1);
            //getOrDefault -> 키가 없는 경우에 대신 사용한 기본 값을 지정 가능
        }
        System.out.println("map = " + map);
    }
}
