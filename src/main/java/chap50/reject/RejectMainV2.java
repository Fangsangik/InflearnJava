package chap50.reject;

import chap49.executor.RunnableTask;

import java.util.concurrent.*;

import static chap41.util.MyLogger.log;

public class RejectMainV2 {
    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(1,1,0,
                TimeUnit.SECONDS,
                new SynchronousQueue<>(),//바로 reject를 받을 수 있음
                new ThreadPoolExecutor.DiscardPolicy()); //조용히 버리는 정책, 아무 로직도 없음

        executor.submit(new RunnableTask("task1"));
        executor.submit(new RunnableTask("task2"));

        executor.shutdown();
    }
}
