package chap41.thread;

import chap41.util.MyLogger;

import static chap41.util.MyLogger.log;

public class InnerRunnableMainV3 {
    public static void main(String[] args) {
        log("main() start");

        //익명 클래스 변수 없이 전달
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        });

        thread.start();
        log("main() end");
    }
}
