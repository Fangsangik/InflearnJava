package chap35.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>(Arrays.asList(90,80,70,60,50));
        int rst = 0;
        for (Integer student : students) {
            rst += student;
        }

        double average = (double) rst / students.size();

        System.out.println("rst = " + rst);
        System.out.println("average = " + average);
    }
}
