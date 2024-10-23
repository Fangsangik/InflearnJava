package chap49.executor;

import java.util.Random;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable task = new MyRunnable();
        Thread thread = new Thread(task, "T1");
        thread.start();
        thread.join();
        int result = task.value;
        log("result Value = " + result);
    }

    static class MyRunnable implements Runnable {

        int value;

        @Override
        public void run() {
            log("Runnable 시작");
            sleep(2000);
            value = new Random().nextInt(10);
            log("create Value = " + value);
            log("Runnable 완료 ");
        }
    }
}
