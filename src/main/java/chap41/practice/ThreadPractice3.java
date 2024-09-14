package chap41.practice;

import static chap41.util.MyLogger.log;

public class ThreadPractice3 {
    public static void main(String[] args) {
        log("main() start");

        Runnable runnable = new Runnable() {
            public void run() {

                for (int i = 0; i < 5; i++) {
                log("val " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread = new Thread(runnable, "run");
        thread.start();
    }
}
