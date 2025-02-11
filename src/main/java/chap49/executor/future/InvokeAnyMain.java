package chap49.executor.future;

import chap49.executor.CallableTask;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static chap41.util.MyLogger.log;

public class InvokeAnyMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        CallableTask t1 = new CallableTask("t1", 1000);
        CallableTask t2 = new CallableTask("t2", 2000);
        CallableTask t3 = new CallableTask("t3", 3000);
        List<CallableTask> tasks = List.of(t1, t2, t3);


        Integer value = es.invokeAny(tasks);
        log("value = " + value);
        es.shutdown();
    }
}
