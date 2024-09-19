package chap41.controller.join;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class JoinMainV0 {
    public static void main(String[] args) {
        log("start");

        Thread thread1 = new Thread(new Job(), "thread - 1");
        Thread thread2 = new Thread(new Job(), "thread - 2");

        thread1.start();
        thread2.start();
        log("end"); //main은 기다리지 않는다.
    }

    static class Job implements Runnable {
        public void run() {
            log("작업 시작");
            sleep(2000);
            log("작업 완료");
        }
    }
}
