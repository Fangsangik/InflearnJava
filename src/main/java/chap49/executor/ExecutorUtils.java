package chap49.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static chap41.util.MyLogger.log;

public abstract class ExecutorUtils {
    public static void printState(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) { //구현체로 ThreadPoolExecutor 넘어옴 (casting)
            int pool = poolExecutor.getPoolSize(); //현재 생성된 스레드 개수
            int active = poolExecutor.getActiveCount(); //현재 일하고 있는 스래드

            int queueTasks = poolExecutor.getQueue().size(); //스레드가 작업을 던지면 queue의 작업을 당김(큐에 작업이 얼마나 들어있는지)
            long completedTasks = poolExecutor.getCompletedTaskCount();//완료된 작업은??

            log("[pool= " + pool + ", active=" + active + ", queueTasks=" + queueTasks + ", completedTasks=" + completedTasks + "]");
        } else {
            log(executorService);
        }
    }
}
