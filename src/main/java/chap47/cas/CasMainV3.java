package chap47.cas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class CasMainV3 {
    private static final int THREAD_COUNT = 2;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start Value = " + atomicInteger.get());

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                incrementAndGet(atomicInteger);
            }
        };

        List<Thread> threads = new ArrayList<>(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int result = atomicInteger.get();
        System.out.println(atomicInteger.getClass().getSimpleName() + " resultValue = " + result);
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;

        do {
            getValue = atomicInteger.get(); //아토믹 인티져에서 읽은 값을 getValue에 넣음 = 0 //Thread 1 : 0
            sleep(100); //스레드 동시 실행을 위한 대기
            log("getValue = " + getValue); //Thread 2가 값을 갑자기 1로 변경하면 -> 실패
            result = atomicInteger.compareAndSet(getValue, getValue + 1); //앍은 값을 읽고 update 시점에 같다면 읽은 값에 + 1 (아토믹 인티져가 갖고 있는 값이 0일 때만 증가 시킬 것이다)
            log("result = " + result);

        } while (!result);

        //처음 읽었던 값 그대로
        return getValue + 1;
        //다른 스레드가 값을 변경 할 수도 있다.
        //return atomicInteger.get();
    }
}
