package chap41.thread;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");

        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable); // 작업을 넣어줄 수 있다.
        thread.start();

        System.out.println(Thread.currentThread().getName() + " : main() end");
    }
}
