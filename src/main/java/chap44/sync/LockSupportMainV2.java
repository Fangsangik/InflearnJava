package chap44.sync;

import java.util.concurrent.locks.LockSupport;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class LockSupportMainV2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ParkTask(), "T1");
        t1.start();

        //잠시 대기하여 t1이 Park 상태에 빠질 시간을 준다.
        sleep(100);
        log("T1 state : " + t1.getState());
    }

    static class ParkTask implements Runnable {

        @Override
        public void run() {
            log("Park 시작, 2초 대기");
            LockSupport.parkNanos(2000_000000); //2초 뒤 깨어난다.
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태 : " + Thread.currentThread().isInterrupted());
        }
    }
}
