package chap41.thread;

//실무에서는 이 방법 주로 사용
public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : run()");
    }
}
