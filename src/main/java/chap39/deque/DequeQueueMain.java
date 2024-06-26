package chap39.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();


        dq.offer(1);
        dq.offer(2);
        dq.offer(3);
        System.out.println("dq = " + dq);

        System.out.println("dq.peek() = " + dq.peek());

        System.out.println("dq.poll() = " + dq.poll());
        System.out.println("dq.poll() = " + dq.poll());
        System.out.println("dq.poll() = " + dq.poll());
        System.out.println("dq.poll() = " + dq.poll());
        System.out.println("dq = " + dq);
    }
}
