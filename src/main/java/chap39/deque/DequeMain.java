package chap39.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerFirst(1);
        System.out.println("dq = " + dq);
        dq.offerFirst(2);
        System.out.println("dq = " + dq);
        dq.offerLast(3);
        System.out.println("dq = " + dq);
        dq.offerLast(4);
        System.out.println("dq = " + dq);

        System.out.println("dq.peekFirst() = " + dq.peekFirst());
        System.out.println("dq.peekLast() = " + dq.peekLast());

        System.out.println("dq.pollFirst() = " + dq.pollFirst());
        System.out.println("dq.pollFirst() = " + dq.pollFirst());
        System.out.println("dq.pollLast() = " + dq.pollLast());
        System.out.println("dq.pollLast() = " + dq.pollLast());
        System.out.println("dq = " + dq);
    }
}
