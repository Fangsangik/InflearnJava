package chap41.controller.join;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class JoinMainV3 {
    public static void main(String[] args) throws InterruptedException {
        log("start");

        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

        //기다리게 하는 방법 = sleep 
        log("join() -> main 스레드가 thread1, thread2 종료까지 대기");
        thread1.join();
        thread2.join();
        log("mainThread 대기 완료");

        log("task1.rst = " + task1.rstVal);
        log("task2.rst = " + task2.rstVal);

        int sumAll = task1.rstVal + task2.rstVal;
        log("sumAll = " + sumAll);
        log("end");
    }

    static class SumTask implements Runnable {
        int statVal;
        int endVal;
        int rstVal;

        public SumTask(int statVal, int endVal) {
            this.statVal = statVal;
            this.endVal = endVal;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;

            for (int i = statVal; i <= endVal ; i++) {
                sum += i;
            }
            rstVal = sum;
            log("작업 완료 = " + rstVal);
        }
    }
}
