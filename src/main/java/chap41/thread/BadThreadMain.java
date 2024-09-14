package chap41.thread;

public class BadThreadMain {
    public static void main(String[] args) {
        //main이 실행 중
        //Thread-0 : run() -> 실행
        System.out.println("Thread.currentThread().getName()" + " : main() start"); // 실행중인 스레드 호출

        HelloThread helloThread = new HelloThread();
        System.out.println("Thread.currentThread().getName()" + " : start() 호출 전");

        //별도의 스레드가 run을 호출하는 것이 아닌, main 스레드가 run 메서드를 호출
        helloThread.run(); // run 호출
        System.out.println("Thread.currentThread().getName()" + " : start() 호출 후");

        System.out.println("Thread.currentThread().getName()" + " : main() end");
    }
}
