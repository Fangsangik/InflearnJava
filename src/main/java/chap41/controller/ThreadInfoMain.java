package chap41.controller;

import chap41.thread.HelloRunnable;

import static chap41.util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        //main 스레드 -> 처음 딱 실행 되는게 main Thread
        Thread mainThread = Thread.currentThread();
        log("main Thread: " + mainThread);
        log("mainThreadId: " + mainThread.getId()); //Java가 자동으로 만들어줌
        log("mainThreadName: " + mainThread.getName());
        log("mainThread.getPriority: " + mainThread.getPriority()); // 우선순위 기본이 5
        log("mainThread.getThreadGroup: " + mainThread.getThreadGroup());
        log("mainThread.getState: " + mainThread.getState());

        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread: " + myThread);
        log("myThreadId: " + myThread.getId()); //Java가 자동으로 만들어줌
        log("myThreadName: " + myThread.getName());
        log("myThread.getPriority: " + myThread.getPriority()); // 우선순위 기본이 5
        log("myThread.getThreadGroup: " + myThread.getThreadGroup());
        log("myThread.getState: " + myThread.getState());
    }
}
