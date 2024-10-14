package chap44.sync;

import java.util.concurrent.locks.LockSupport;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class LockSupportMainV1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ParkTask(), "T1");
        t1.start();

        //잠시 대기하여 t1이 Park 상태에 빠질 시간을 준다.
        sleep(100);
        log("T1 state : " + t1.getState());

        log("main -> unpark(T1)"); //unpark 사용해서 t1을 꺠움
        //LockSupport.unpark(t1); //unpark 사용
        t1.interrupt(); //interrupt 사용 waiting 상태를 빠져나온다.
    }

    static class ParkTask implements Runnable {

        @Override
        public void run() {
            log("Park 시작");
            LockSupport.park(); //t1은 이 코드를 실행할때 sleep을 함 -> main Thread가 대기
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태 : " + Thread.currentThread().isInterrupted());
        }
    }
}
