package chap50;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static chap50.ExecutorUtils.printState;

//스레드를 먼저 만들어 놓는다.
public class PrestartPoolMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1000);
        printState(es);

        ThreadPoolExecutor pool = (ThreadPoolExecutor) es;
        pool.prestartAllCoreThreads();
        printState(es);
    }
}
