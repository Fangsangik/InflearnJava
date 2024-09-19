package chap41.controller;

import static chap41.util.MyLogger.log;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread");
        log("myThread.state1 : " + thread.getState()); //new
        log("myThread.start()");
        thread.start();
        Thread.sleep(1000);
        log("myThread.state3 : " + thread.getState()); //바로 찍으면 Runnable 에서 sleep이 적용 x
        Thread.sleep(4000);
        log("myThread.state4 : " + thread.getState()); // 종료된 상태
        log("end");
    }

    //myThread가 만들어지면 MyRunnable이 작동한다.
    static class MyRunnable implements Runnable {
        public void run() {
            try {
                log("start");
                log("myThread state2 = " + Thread.currentThread().getState()); //Runnable
                log("sleep() start");
                Thread.sleep(3000); // 자는중 -> Thread 상태 찍을 수 없음
                log("myThread sleep() end");
                log("myThread state4 = " + Thread.currentThread().getState());
                log("end");
            } catch (InterruptedException e) { //Run에서는 예외를 던질 수 없다.
                throw new RuntimeException(e);
            }
        }
    }
}
