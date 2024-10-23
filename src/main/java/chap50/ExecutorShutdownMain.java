package chap50;

import chap49.executor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static chap41.util.MyLogger.log;
import static chap49.executor.ExecutorUtils.printState;

public class ExecutorShutdownMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new RunnableTask("taskA"));
        es.execute(new RunnableTask("taskB"));
        es.execute(new RunnableTask("taskC"));
        es.execute(new RunnableTask("longTask", 100_000));
        printState(es);

        log("== shutdown 시작 ==");
        shutdownAndAwaitTermination(es);
        log("== shutdown 완료 ==");
        printState(es);
    }

    static void shutdownAndAwaitTermination(ExecutorService es) {
        es.shutdown(); //non-blocking, 새로운 작업을 받지 않는다. 처리중이거나 큐에 이미 대기중인 작업까지만 처리

        try {
            //이미 대기중인 잡업들 완료까지 10초 기다림
            log("서비스 정상 종료 시도");
            if (!es.awaitTermination(10, TimeUnit.SECONDS)) {
                //정상 종료 기다려줌
                //정상 종료가 너무 오래 걸림..
                log("정상 종료 실패 -> 강제 종료");
                es.shutdownNow();
                // 자원 종료돨 때까지 기다림
                // 작업이 취소될 떄 대기
                // 종료가 안될 경우..
                if (es.awaitTermination(10, TimeUnit.SECONDS)) {
                    log("서비스가 종료되지 않았습니다.");
                }
            }
        } catch (InterruptedException e) {
            //대기 중인 현재 스레드가 인터럽트 될 수 있음
            es.shutdownNow();
        }
    }
}
