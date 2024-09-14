package chap41.thread;

import chap41.util.MyLogger;

import static chap41.util.MyLogger.log;

public class InnerRunnableMainV1 {
    public static void main(String[] args) {
        log("main() start");
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }

    //특정 클래스 안에서만 사용하는 경우 중첩 클래스 사용
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }
}
