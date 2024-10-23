package chap49.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;
import static chap49.executor.ExecutorUtils.printState;

public class ExecutorBasicMain {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor
                (2,2,0, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<>());
        //LinkedBlockingQueue -> 무제한으로 꺼낼 수 있음, 없으면 대기

        log("== 초기 상태 ==");
        printState(es);
        es.execute(new RunnableTask("taskA"));
        es.execute(new RunnableTask("taskB"));
        //재사용 구간
        es.execute(new RunnableTask("taskC"));
        es.execute(new RunnableTask("taskD"));

        log("== 작업 수행 중 ==");
        printState(es);

        sleep(3000);
        //두개의 스레드가 있는데 둘다 쉬는 중
        log("== 작업 수행 완료 ==");
        printState(es);

        es.shutdown();
        log("== shutdown 완료 ==");
        printState(es);
    }
}
