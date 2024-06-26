package chap39.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.push(1);
        dq.push(2);
        dq.push(3);
        System.out.println("dq = " + dq);

        //꺼낼 요소 확인 (꺼내지 않고 단순 조회만)
        System.out.println("dq.peek() = " + dq.peek());

        //스택 요소 뽑기
        System.out.println("dq.pop() = " + dq.pop());
        System.out.println("dq.pop() = " + dq.pop());
        System.out.println("dq.pop() = " + dq.pop());
        System.out.println("dq = " + dq);
    }
}
