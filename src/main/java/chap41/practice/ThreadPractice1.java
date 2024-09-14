package chap41.practice;

import chap41.util.MyLogger;

import static chap41.util.MyLogger.log;

public class ThreadPractice1 {
    public static void main(String[] args) {
        log("main() start");

        PrThread thread = new PrThread();
        thread.start();
    }

    static class PrThread extends Thread {

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
