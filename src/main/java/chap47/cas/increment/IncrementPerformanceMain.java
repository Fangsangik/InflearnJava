package chap47.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementPerformanceMain {
    private static final long COUNT = 100_000_000;

    public static void main(String[] args) {
        test(new BasicInteger());
        test(new VolatileInteger());
        test(new SyncInteger());
        test(new MyAtomicInteger());
    }

    private static void test (IncrementInteger incrementInteger) {
        long startMs = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            incrementInteger.increment();
        }

        long endMs = System.currentTimeMillis();
        System.out.println(incrementInteger.getClass().getSimpleName() + ": ms = " + (endMs - startMs));
    }
}
