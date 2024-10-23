package chap49.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class CallableMainV1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<Integer> future = es.submit(new MyCallable()); //future를 반환
        Integer result = future.get(); //Main이 바로 호출
        log("result Value = " + result);
        es.shutdown();
    }

    static class MyCallable implements Callable<Integer> {


        @Override
        public Integer call() throws Exception {
            log("Callable 시작");
            sleep(2000);
            int value = new Random().nextInt(10);
            log("create value = " + value);
            log("Callable 끝");
            return value;
        }
    }
}
