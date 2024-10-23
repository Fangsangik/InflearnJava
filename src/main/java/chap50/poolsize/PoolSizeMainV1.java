package chap50.poolsize;

import chap50.RunnableTask;

import java.util.concurrent.*;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;
import static chap50.ExecutorUtils.printState;

public class PoolSizeMainV1 {
    public static void main(String[] args) {
        BlockingQueue<Runnable> wokeQueue = new ArrayBlockingQueue<>(2); //최대 사이즈 2개
        ExecutorService es = new ThreadPoolExecutor(2, 4, 3000, TimeUnit.MILLISECONDS, wokeQueue);
        printState(es);

        es.execute(new RunnableTask("task1"));
        printState(es);

        es.execute(new RunnableTask("task2"));
        printState(es);

        //queue에 들어가버린다.
        es.execute(new RunnableTask("task3"));
        printState(es);

        es.execute(new RunnableTask("task4"));
        printState(es);

        //queue 가득 참 -> pool이 하나 생성 (큐까지 가득 차면 pool size가 늘어난다)
        es.execute(new RunnableTask("task5"));
        printState(es);

        es.execute(new RunnableTask("task6"));
        printState(es);

        //모두 다 찬 상태에서 더 넣으면 rejectedException 발생하게 됨
        try {
            es.execute(new RunnableTask("task7"));
        } catch (RejectedExecutionException e) {
            log("task7 실행 거절 예외 발생 : " + e);
        }
        sleep(3000);
        log("== 수행 작업 완료 ==");
        printState(es);

        //초과 스레드들은 대기 시간만큼 일이 없다면 삭제된다.
        sleep(3000);
        log("== maximumPoolSize 대기 시간 초과 ==");
        printState(es);

        es.shutdown();
        log("== shutdown 완료 ==");
        printState(es);
    }
}
