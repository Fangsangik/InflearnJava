package chap47.cas.increment;

import java.util.ArrayList;
import java.util.List;

import static chap41.util.ThreadUtils.sleep;

public class IncrementThreadMain {

    public static final int THREAD_COUNT = 1000;

    public static void main(String[] args) throws InterruptedException {

        //test(new BasicInteger());
        //test(new VolatileInteger());
        //test(new SyncInteger());
        test(new MyAtomicInteger());
    }

    //원자적이지 않은 value++을 호출했기 때문
    private static void test(IncrementInteger incrementInteger)
            throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                sleep(10); //다른 스레드와 동시에 실행을 위해 잠깐 쉼
                incrementInteger.increment();
            }
        };

        //1000개가 동시에 수행
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads){
            thread.join();
        }

        int result = incrementInteger.get();
        System.out.println(incrementInteger.getClass().getSimpleName() + "result : " + result);
    }
}
