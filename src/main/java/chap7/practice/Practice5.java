package chap7.practice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp ;

        temp = a;
        a = b;
        b= temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
