package chap41.thread;

import chap41.util.MyLogger;

import static chap41.util.MyLogger.log;

public class InnerRunnableMainV2 {
    public static void main(String[] args) {
        log("main() start");

        //익명 클래스 사용
        Runnable runnable = new Runnable() {
            public void run() {
                log("run() start");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }
}
