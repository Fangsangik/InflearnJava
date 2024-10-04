package chap42.volatile1;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        t.start();

        sleep(1000);

        task.flag = false;
        log("flag = " + task.flag + " , count = " + task.count + " in main");
    }

    static class MyTask implements Runnable {
        //boolean flag = true;
        //long count;
        volatile boolean flag = true;
        volatile int count;

        @Override
        public void run() {
            log("task 시작");
            while (flag) {
                count++;
                //1억번에 한번씩 출려 5
                if (count % 1000_000_000 == 0) {
                    log("flag = " + flag + " , count = " + count + " in while");
                }
            }
            log("flag = " + flag + " , count = " + count + " 종료");
        }
    }
    //main과 work의 확인한 시점의 숫자가 다르다.
}
