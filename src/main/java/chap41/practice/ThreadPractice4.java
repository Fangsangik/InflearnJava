package chap41.practice;

import chap41.thread.InnerRunnableMainV1;
import chap41.util.MyLogger;

import static chap41.util.MyLogger.log;

public class ThreadPractice4 {
    public static void main(String[] args) {
        log("main() start");

        Thread threadA = new Thread(new PrintWork("ThreadA", 1000));
        Thread threadB = new Thread(new PrintWork("ThreadB", 500));

        threadA.start();
        threadB.start();
    }


    static class PrintWork implements Runnable {

        private String content;
        private int sleepMs;

        PrintWork(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }


        @Override
        public void run() {
            while (true) {
                try {
                    log(content);
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
