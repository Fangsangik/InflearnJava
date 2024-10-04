package chap42.volatile1;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag);
        t.start();

        sleep(1000);
        log("runFlag false 변경 시도");
        task.runFlag = false; //false 이기 때문에 task 종료?? -> 자바가 안끝남
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {
        //boolean runFlag = true;
        volatile boolean runFlag = true;

        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {
                //runFlag  false 변경시 탈출
                //work Thread가 빠져나오지 못함
                //volatile 사용시 Memmory에서 변경 된 값 Thread가 바로 볼 수 있어야 한다.
            }
            log("task 종료");
        }
    }
}
