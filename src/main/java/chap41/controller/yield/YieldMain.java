package chap41.controller.yield;

import static chap41.util.ThreadUtils.sleep;

public class YieldMain {
    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i); // Thread가 0 ~ 9 까지 출력

                //sleep(1);
                Thread.yield();
            }
        }
    }
}
