package chap49.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class CallableMainV2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("submit 호출");

        Future<Integer> future = es.submit(new MyCallable()); //future를 반환
        log("future 즉시 반환, future = " + future);

        log("future.get() [블로킹] 메서드 호출 시작 -> main 스레드 Waiting");
        Integer result = future.get(); //Main이 바로 호출 (결과가 value를 반환할때까지 대기)
        log("future.get() [블로킹] 메서드 호출 완료 -> main 스레드 Runnable");

        log("result Value = " + result);
        log("future 완료, future = " + future);
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
