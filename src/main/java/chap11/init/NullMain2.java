package chap11.init;

import chap11.Data;

public class NullMain2 {
    public static void main(String[] args) {
        InitData data = null;
        data.val1 = 10;
        System.out.println("data = " + data.val1);

    }
}
