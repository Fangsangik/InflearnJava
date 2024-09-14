package chap41.thread;

public class HelloThreadMain {
    public static void main(String[] args) {
        //main이 실행 중
        //Thread-0 : run() -> 실행
        System.out.println("Thread.currentThread().getName()" + " : main() start"); // 실행중인 스레드 호출

        HelloThread helloThread = new HelloThread();
        System.out.println("Thread.currentThread().getName()" + " : start() 호출 전");

        helloThread.start(); // run 호출 하면 안됨
        System.out.println("Thread.currentThread().getName()" + " : start() 호출 후");

        System.out.println("Thread.currentThread().getName()" + " : main() end");
    }
}
