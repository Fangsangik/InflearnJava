package chap39.practice.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackMain {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.add("youtube.com");
        stack.add("google.com");
        stack.add("facebook.com");
        System.out.println("stack = " + stack);

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("stack = " + stack);
    }
}
