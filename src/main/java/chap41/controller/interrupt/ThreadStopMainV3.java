package chap41.controller.interrupt;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class ThreadStopMainV3 {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(100);
        log("작업 중단 지시 상태"); //main 스레드가 인터럽트 실행
        thread.interrupt();
        log("work 스레드 인터럽트 상태 1 : " + thread.isInterrupted()); //work thread -> 인터럽트 상태
    }

    static class MyTask implements Runnable {

        //작업이 다 돌아간 뒤에 작업이 나간 걸 확인 뒤 작업 중단
        //중간에 중지 안됨
        public void run() {
            while (!Thread.currentThread().isInterrupted()) { //인터럽트 상태 변경 X
                log("작업중");
            }
            log("work 스레드 인트럽트 상태 2 : " + Thread.currentThread().isInterrupted()); //계속 인터럽트 상태

            try {
                log("자원 정리 시도");
                Thread.sleep(1000); //sleep을 만나면 exception이 터진다. -> interrupt 상태가 풀린다.
                log("자원 정리 완료");
            } catch (InterruptedException e) { //예외가 터지면서 인터럽트 상태에서 풀리는 것
                log("자원 정리 실패 : 자원 정리중 인터럽트 발생 ");
                log("work 스레드 인트럽트 상태 3 : " + Thread.currentThread().isInterrupted()); //인터럽트 풀리는 상태가 된다.

            }
            log("작업 종료");
        }
    }
}

