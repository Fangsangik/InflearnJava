package chap41.practice;

import static chap41.util.MyLogger.log;

public class ThreadPractice2 {
    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(new PrRunnable(), "run");
        thread.start();

    }

    static class PrRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                log("val" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
