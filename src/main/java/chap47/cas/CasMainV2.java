package chap47.cas;

import java.util.concurrent.atomic.AtomicInteger;

import static chap41.util.MyLogger.log;

public class CasMainV2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println("start value = " + atomicInteger.get());

        int resultValue1 = incrementAndGet(atomicInteger);
        System.out.println("resultValue1 = " + resultValue1);

        int resultValue2 = atomicInteger.incrementAndGet();
        System.out.println("resultValue2 = " + resultValue2); //현재 0이 아니라면 변경되지 않음 / false
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;

        do {
            getValue = atomicInteger.get(); //아토믹 인티져에서 읽은 값을 getValue에 넣음 = 0 //Thread 1 : 0
            log("getValue = " + getValue); //Thread 2가 값을 갑자기 1로 변경하면 -> 실패
            result = atomicInteger.compareAndSet(getValue, getValue + 1); //앍은 값을 읽고 update 시점에 같다면 읽은 값에 + 1 (아토믹 인티져가 갖고 있는 값이 0일 때만 증가 시킬 것이다)
            log("result = " + result);

        } while (!result);

        return getValue + 1;
    }
}
