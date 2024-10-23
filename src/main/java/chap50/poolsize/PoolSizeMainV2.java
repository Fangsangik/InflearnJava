package chap50.poolsize;

import chap50.RunnableTask;

import java.util.concurrent.*;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;
import static chap50.ExecutorUtils.printState;

public class PoolSizeMainV2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        //ExecutorService es = new ThreadPoolExecutor(2, 4, 3000, TimeUnit.MILLISECONDS, wokeQueue);
        log("pool 셍성");
        for (int i = 1; i <= 6; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        es.shutdown();
        log("== shutdown ==");
    }
}
