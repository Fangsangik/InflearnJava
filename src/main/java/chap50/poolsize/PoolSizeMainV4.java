package chap50.poolsize;

import chap49.executor.RunnableTask;

import java.util.concurrent.*;

import static chap41.util.MyLogger.log;
import static chap49.executor.ExecutorUtils.printState;

public class PoolSizeMainV4 {
    //static final int TASK_SIZE = 1100; //일반 -> 100개가 돌아감
    //static final int TASK_SIZE = 1200; //긴급 -> 200 개가 돌아감
    static final int TASK_SIZE = 1201;  //거절

    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000)); //100개는 스레드 1000개는 큐
        printState(es);

        long startMs = System.currentTimeMillis();

        for (int i = 1; i <= TASK_SIZE; i++) {
            String taskName = "task" + i;
            try {
                es.execute(new RunnableTask(taskName));
                printState(es);
            } catch (RejectedExecutionException e) {
                log(taskName + " -> " + e);
            }
        }

        es.shutdown();
        long endMs = System.currentTimeMillis();
        log("time : " + (endMs - startMs));
    }
}
