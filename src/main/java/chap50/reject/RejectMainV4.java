package chap50.reject;

import chap49.executor.RunnableTask;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static chap41.util.MyLogger.log;

public class RejectMainV4 {
    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(1,1,0,
                TimeUnit.SECONDS,
                new SynchronousQueue<>(),//바로 reject를 받을 수 있음
                new MyRejectedExecutionHandler()); //main 스레드가 일하는 것을 볼 수 있음 (생산에 대한 속도를 조절 할 수 있음)

        executor.submit(new RunnableTask("task1"));
        executor.submit(new RunnableTask("task2"));
        executor.submit(new RunnableTask("task3"));
        executor.submit(new RunnableTask("task4"));

        executor.shutdown();
    }


    static class MyRejectedExecutionHandler implements RejectedExecutionHandler {

        static AtomicInteger count = new AtomicInteger(0);

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            int i = count.incrementAndGet();
            log("[경고] 거절된 누적 작업 수 : " + i);
        }
    }
}
