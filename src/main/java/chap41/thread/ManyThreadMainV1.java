package chap41.thread;

import static chap41.util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) {
        log("main() start");

        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread1 = new Thread(helloRunnable);
        thread1.start();
        Thread thread2 = new Thread(helloRunnable);
        thread2.start();
        Thread thread3 = new Thread(helloRunnable);
        thread3.start();

        log("main() end");
        //실행 순서를 보장 할 수 없음
        //스레드 생성할 때 모두 같은 HelloRunnable 인스턴스의 스레드 작업 실행
        //HelloRunnable 인스턴스에 있는 run 메서드 실행
    }
}
