package chap47.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println("start value = " + atomicInteger.get());

        boolean result1 = atomicInteger.compareAndSet(0, 1); //비교하는 값이 0이면 1로 setting
        System.out.println("result1 = " + result1 + "; value = " + atomicInteger.get());

        boolean result2 = atomicInteger.compareAndSet(0, 1); //atomicInteger에 값이 만약 0이면 1로 Setting
        System.out.println("result2 = " + result2 + "; value = " + atomicInteger.get()); //현재 0이 아니라면 변경되지 않음 / false
    }
}
