package chap41.controller.interrupt;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class ThreadStopMainV1 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 runFlag = false");
        task.runFlag = false;
    }

    static class MyTask implements Runnable {
        volatile boolean runFlag = true;

        //작업이 다 돌아간 뒤에 작업이 나간 걸 확인 뒤 작업 중단
        //중간에 중지 안됨
        public void run() {
            while (runFlag) {
                log("작업중");
                sleep(3000);
            }

            log("자원 정리");
            log("작업 종료");
        }
    }
}
