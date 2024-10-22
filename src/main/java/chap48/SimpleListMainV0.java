package chap48;

import chap35.list.ArrayList;
import chap35.list.List;

public class SimpleListMainV0 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");

        System.out.println(list);
    }
}
