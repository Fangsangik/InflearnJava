package chap50.poolsize;

import chap50.RunnableTask;

import java.util.concurrent.*;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;
import static chap50.ExecutorUtils.printState;

public class PoolSizeMainV3 {
    public static void main(String[] args) {
        //ExecutorService es = Executors.newCachedThreadPool();
        ThreadPoolExecutor es = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 3,
                TimeUnit.SECONDS  ,
                new SynchronousQueue<>());
        log("pool 셍성");
        printState(es);

        for (int i = 1; i <= 4; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        sleep(3000);
        log("==작업 수행 완료==");
        printState(es);

        sleep(3000);
        log("== maximumPoolSize 대기 시간 초과==");
        printState(es);


        es.shutdown();
        log("== shutdown ==");
    }
}
