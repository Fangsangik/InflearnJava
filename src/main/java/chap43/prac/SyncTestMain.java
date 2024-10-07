package chap43.prac;

import static chap41.util.MyLogger.log;

public class SyncTestMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        log("결과 : " + counter.getCnt());

    }

    //cnt는 여러 스레드가 공유되는 자원
    //스래드 2개가 increment를 호출 -> cnt 값 두개 (increment를 두번 호출 -> 하지만 그중 하나의 값은 날라감)
    //cnt 값을 읽ㅇ서 계사하는 부분과 그 결과를 cnt 넣는 부분 나눠져있음

    static class Counter {
        private int cnt = 0;

        //임계영역
        public synchronized void increment() {
            cnt++;
        }

        public synchronized int getCnt () {
            return cnt;
        }
    }
}
