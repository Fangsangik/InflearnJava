package chap41.practice;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class JoinPractice {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t1");
        Thread t3 = new Thread(new MyTask(), "t1");

        log("main 스레드 대기 시작 ");
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
        log("main 스레드 종료");
        System.out.println("모든 스레드 종료 ");
    }


    static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 3 ; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
}
